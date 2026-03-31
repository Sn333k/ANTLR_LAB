package compiler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import grammar.firstLexer;
import grammar.firstParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class StartCompiler {
    public static void main(String[] args) {
        CharStream inp = null;

        try {
            inp = CharStreams.fromFileName("we.first");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        CharStream inp = CharStreams.fromString("1\n2+3+4","wejście");
        firstLexer lex = new firstLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        firstParser par = new firstParser(tokens);

        ParseTree tree = par.prog();
        //st group
        System.out.println("===REGISTER===");
        printCompiler("src/compiler/register.stg", tree, "wyReg.asm");
        //System.out.println("===STACK===");
        //printCompiler("src/compiler/stack.stg", tree, "wyStack.asm");

//        STGroup.trackCreationEvents = true;
//        res.inspect();
    }
    private static void printCompiler(String stgPath, ParseTree tree, String outFile){
        STGroup group = new STGroupFile(stgPath);

        EmitVisitor em = new EmitVisitor(group);
        ST res = em.visit(tree);

        System.out.println(res.render());
        try {
            var wr = new FileWriter(outFile);
            wr.write(res.render());
            wr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
