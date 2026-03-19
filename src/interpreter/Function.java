package interpreter;

import grammar.firstParser;

import java.util.List;

public class Function {
    public List<String> params;
    public firstParser.BlockContext body;

    public Function(List<String> params, firstParser.BlockContext body) {
        this.params = params;
        this.body = body;
    }
}
