package compiler;

import grammar.firstLexer;
import grammar.firstParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartCompiler {
    public static void main(String[] args) {
        CharStream inp;
        try {
            inp = CharStreams.fromFileName("we.first");
        } catch (IOException e) {
            throw new RuntimeException("File error reader: " + e.getMessage());
        }

        firstLexer lex = new firstLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        firstParser parser = new firstParser(tokens);

        firstParser.ProgContext tree = parser.prog();

        STGroup group = new STGroupFile("src/compiler/register.stg");
        EmitVisitor em = new EmitVisitor(group);

        List<ST> funcsST = new ArrayList<>();
        List<ST> mainST = new ArrayList<>();

        for (var statCtx : tree.stat()) {
            if (statCtx instanceof firstParser.FuncDefContext) {
                funcsST.add(em.visit(statCtx));
            } else {
                mainST.add(em.visit(statCtx));
            }
        }

        ST progST = group.getInstanceOf("program")
                .add("funcs", funcsST)
                .add("main", mainST);

        String asmCode = progST.render();
        System.out.println("=== REGISTER MACHINE===");
        System.out.println(asmCode);

        try (FileWriter wr = new FileWriter("wyReg.asm")) {
            wr.write(asmCode);
        } catch (IOException e) {
            throw new RuntimeException("Error file: " + e.getMessage());
        }
    }
}