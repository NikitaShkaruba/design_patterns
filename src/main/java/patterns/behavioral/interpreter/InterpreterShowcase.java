package patterns.behavioral.interpreter;

import patterns.behavioral.interpreter.expressions.Number;
import java.util.HashMap;
import java.util.Map;

/**
 * Pattern *InterpreterShowcase* specifies how to evaluate sentences in a language.
 * The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language.
 * The syntax tree of a sentence in the language is an instance of the composite pattern and
 * is used to evaluate (interpret) the sentence for a client
 */
public class InterpreterShowcase {
    public static void main(String[] args) {
        String expression;

        if (args.length != 0) {
            // user case
            expression = args[0];
        } else {
            // test case
            expression = "w x z - +";
        }

        Evaluator sentence = new Evaluator(expression);

        Map<String,Expression> variables = new HashMap<>();
        variables.put("w", new Number(5));  // Interpret w as 5
        variables.put("x", new Number(10)); // Interpret x as 10
        variables.put("z", new Number(42)); // Interpret z as 42

        int result = sentence.interpret(variables);
        System.out.println(result);
    }
}