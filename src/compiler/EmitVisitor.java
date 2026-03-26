package compiler;

import grammar.firstLexer;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import grammar.firstBaseVisitor;
import grammar.firstParser;

import java.util.HashMap;
import java.util.Map;

public class EmitVisitor extends firstBaseVisitor<ST> {
    private Map<String, Integer> globals = new HashMap<>();
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


    /*@Override
    public ST visitTerminal(TerminalNode node) {
        return new ST("Terminal node:<n>").add("n",node.getText());
    }*/

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
        if (!globals.containsKey(name)) {
            throw new RuntimeException("Undefined variable: " + name);
        }
        int addr = globals.get(name);
        ST st = stGroup.getInstanceOf("load");
        st.add("name", name);
        return st;
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
}
