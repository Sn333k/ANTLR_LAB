package interpreter;

import grammar.firstParser;

import java.util.List;

public class Function {
    public List<String> parameters;
    public firstParser.BlockContext body;

    public Function(List<String> params, firstParser.BlockContext body) {
        this.parameters = params;
        this.body = body;
    }
}
