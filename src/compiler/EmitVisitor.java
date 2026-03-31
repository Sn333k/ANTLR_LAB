package compiler;

import grammar.firstLexer;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import grammar.firstBaseVisitor;
import grammar.firstParser;

import java.util.HashMap;
import java.util.Map;

public class EmitVisitor extends firstBaseVisitor<ST> {
    private final Map<String, Integer> globals = new HashMap<>();
    private final Map<String, Integer> currentParams = new HashMap<>();
    private int addr = 0;
    private final STGroup stGroup;

    public EmitVisitor(STGroup group) {
        super();
        this.stGroup = group;
    }

    @Override
    protected ST defaultResult() {
        return stGroup.getInstanceOf("deflt");
    }

    @Override
    protected ST aggregateResult(ST aggregate, ST nextResult) {
        if(nextResult!=null)
            aggregate.add("elem",nextResult);
        return aggregate;
    }

    @Override
    public ST visitInt_tok(firstParser.Int_tokContext ctx) {
        ST st = stGroup.getInstanceOf("int");
        st.add("i",ctx.INT().getText());
        return st;
    }

    @Override
    public ST visitBinOp(firstParser.BinOpContext ctx) {
        //System.out.println(ctx.op.getType());
        String opName = switch (ctx.op.getType()) {
            case firstLexer.ADD -> "dodaj";
            case firstLexer.SUB -> "sub";
            case firstLexer.MUL -> "mul";
            case firstLexer.DIV -> "div";
            default -> throw new RuntimeException("Unknown op");
        };

        ST st = stGroup.getInstanceOf(opName);
        st.add("p1", visit(ctx.l));
        st.add("p2", visit(ctx.r));

        return st;
    }

    @Override
    public ST visitVarDecl(firstParser.VarDeclContext ctx) {
        String name = ctx.ID().getText();
        if (!globals.containsKey(name)) {
            globals.put("x", addr++);
        }
        ST st = stGroup.getInstanceOf("dek");
        st.add("n", name);
        return st;
    }

    @Override
    public ST visitVar(firstParser.VarContext ctx) {
        String name = ctx.ID().getText();
        if (currentParams.containsKey(name)) {
            return stGroup.getInstanceOf("arg")
                    .add("n", currentParams.get(name)+1);
        }
        return stGroup.getInstanceOf("load")
                .add("name", name);
    }

    @Override
    public ST visitAssign(firstParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        if (!globals.containsKey(name)) {
            throw new RuntimeException("Variable not declared: " + name);
        }
        ST st = stGroup.getInstanceOf("store");
        st.add("name", name);
        st.add("expr", visit(ctx.expr()));
        return st;
    }

    @Override
    public ST visitFuncDef(firstParser.FuncDefContext ctx) {
        currentParams.clear();
        if (ctx.par != null) {
            int n = ctx.par.size();
            for (int i = 0; i < n; i++) {
                currentParams.put(ctx.par.get(i).getText(), n - i);
            }
        }
        return stGroup.getInstanceOf("funcDef")
                .add("name", ctx.name.getText())
                .add("body", visit(ctx.block()));
    }

    @Override
    public ST visitFuncCall(firstParser.FuncCallContext ctx) {
        ST args = stGroup.getInstanceOf("deflt");
        if (ctx.argList != null) {
            for (var e : ctx.argList) {
                args.add("elem",
                        stGroup.getInstanceOf("pushArg")
                                .add("expr", visit(e))
                );
            }
        }
        return stGroup.getInstanceOf("funcCall")
                .add("name", ctx.ID().getText())
                .add("args", args);
    }
}
