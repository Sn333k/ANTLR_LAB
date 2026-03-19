package interpreter;

import grammar.*;
import SymbolTable.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalculateVisitor extends firstBaseVisitor<Integer> {
    private TokenStream tokStream = null;
    private CharStream input=null;
    private final GlobalSymbols<Integer> globals = new GlobalSymbols<>();
    private final LocalSymbols<Integer> locals = new LocalSymbols<>();
    private HashMap<String, Function> functions = new HashMap<>();

    public CalculateVisitor(CharStream inp) {
        super();
        this.input = inp;
    }

    public CalculateVisitor(TokenStream tok) {
        super();
        this.tokStream = tok;
    }
    public CalculateVisitor(CharStream inp, TokenStream tok) {
        super();
        this.input = inp;
        this.tokStream = tok;
    }
    private String getText(ParserRuleContext ctx) {
        int a = ctx.start.getStartIndex();
        int b = ctx.stop.getStopIndex();
        if(input==null) throw new RuntimeException("Input stream undefined");
        return input.getText(new Interval(a,b));
    }
    @Override
    public Integer visitIf_stat(firstParser.If_statContext ctx) {
        Integer result = 0;
        if (visit(ctx.cond)!=0) {
            result = visit(ctx.then);
        }
        else {
            if(ctx.else_ != null)
                result = visit(ctx.else_);
        }
        return result;
    }

    @Override
    public Integer visitPrint_stat(firstParser.Print_statContext ctx) {
        var st = ctx.expr();
        var result = visit(st);
        System.out.printf("|%s=%d|\n", st.getText(), result); //nie drukuje ukrytych ani pominiętych spacji
        //System.out.printf("|%s=%d|\n", getText(st),  result); //drukuje wszystkie spacje
        //System.out.printf("|%s=%d|\n", tokStream.getText(st),  result); //drukuje spacje z ukrytego kanału, ale nie ->skip
        return result;
    }

    @Override
    public Integer visitInt_tok(firstParser.Int_tokContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitPars(firstParser.ParsContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitBinOp(firstParser.BinOpContext ctx) {
        int result=0;
        switch (ctx.op.getType()) {
            case firstLexer.ADD:
                result = visit(ctx.l) + visit(ctx.r);
                break;
            case firstLexer.SUB:
                result = visit(ctx.l) - visit(ctx.r);
                break;
            case firstLexer.MUL:
                result = visit(ctx.l) * visit(ctx.r);
                break;
            case firstLexer.DIV:
                try {
                    result = visit(ctx.l) / visit(ctx.r);
                } catch (Exception e) {
                    System.err.println("Div by zero");
                    throw new ArithmeticException();
                }
        }
        return result;
    }
    private Integer getVar(String name) {
        try {
            return locals.getSymbol(name);
        } catch (Exception e) {
            return globals.getSymbol(name);
        }
    }

    @Override
    public Integer visitVar(firstParser.VarContext ctx) {
        String name = ctx.ID().getText();
        return getVar(name);
    }

    @Override
    public Integer visitAssign(firstParser.AssignContext ctx) {
        String name = ctx.ID().getText();
        Integer value = visit(ctx.expr());
        try {
            locals.setSymbol(name, value);
        } catch (Exception e) {
            if (globals.hasSymbol(name)) {
                globals.setSymbol(name, value);
            } else {
                locals.newSymbol(name);
                locals.setSymbol(name, value);
            }
        }

        return value;
    }

    @Override
    public Integer visitBlock_single(firstParser.Block_singleContext ctx) {
        return visit(ctx.stat());
    }

    @Override
    public Integer visitBlock_real(firstParser.Block_realContext ctx) {
        locals.enterScope();
        Integer result = 0;
        for (var b : ctx.block()) {
            result = visit(b);
        }
        locals.leaveScope();
        return result;
    }

    @Override
    public Integer visitRelOp(firstParser.RelOpContext ctx) {
        int l = visit(ctx.l);
        int r = visit(ctx.r);
        return switch (ctx.op.getType()) {
            case firstLexer.GT -> (l > r) ? 1 : 0;
            case firstLexer.LT -> (l < r) ? 1 : 0;
            case firstLexer.GE -> (l >= r) ? 1 : 0;
            case firstLexer.LE -> (l <= r) ? 1 : 0;
            case firstLexer.EQ -> (l == r) ? 1 : 0;
            case firstLexer.NE -> (l != r) ? 1 : 0;
            default -> 0;
        };
    }

    @Override
    public Integer visitLogicOp(firstParser.LogicOpContext ctx) {
        int l = visit(ctx.l);
        if (ctx.op.getType() == firstLexer.AND) {
            if (l == 0) return 0;
            return (visit(ctx.r) != 0) ? 1 : 0;
        }
        if (ctx.op.getType() == firstLexer.OR) {
            if (l != 0) return 1;
            return (visit(ctx.r) != 0) ? 1 : 0;
        }
        return 0;
    }

    @Override
    public Integer visitNotOp(firstParser.NotOpContext ctx) {
        return (visit(ctx.expr()) == 0) ? 1 : 0;
    }

    @Override
    public Integer visitWhile_stat(firstParser.While_statContext ctx) {
        Integer result = 0;
        while (visit(ctx.cond) != 0) {
            result = visit(ctx.body);
        }
        return result;
    }

    @Override
    public Integer visitFuncDef(firstParser.FuncDefContext ctx) {
        String name = ctx.ID().getText();
        List<String> params = new ArrayList<>();
        if (ctx.paramList() != null) {
            for (var id : ctx.paramList().ID()) {
                params.add(id.getText());
            }
        }
        Function f = new Function(params, ctx.block());
        functions.put(name, f);
        return 0;
    }

    @Override
    public Integer visitFuncCall(firstParser.FuncCallContext ctx) {
        String name = ctx.ID().getText();
        Function f = functions.get(name);
        if (f == null) {
            throw new RuntimeException("Function " + name + " not defined!");
        }
        List<Integer> args = new ArrayList<>();
        if (ctx.argList() != null) {
            for (var e : ctx.argList().expr()) {
                args.add(visit(e));
            }
        }
        if (args.size() != f.params.size()) {
            throw new RuntimeException("Wrong number of arguments!");
        }
        locals.enterScope();
        for (int i = 0; i < args.size(); i++) {
            locals.newSymbol(f.params.get(i));
            locals.setSymbol(f.params.get(i), args.get(i));
        }
        Integer result = visit(f.body);
        locals.leaveScope();
        return result;
    }
}
