package patterns.behavioral.interpreter;

import java.util.Map;

// Basic interface for expressions
public interface Expression {
    int interpret(Map<String,Expression> variables);
}

