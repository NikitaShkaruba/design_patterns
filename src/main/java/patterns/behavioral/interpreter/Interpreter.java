package patterns.behavioral.interpreter;

import patterns.behavioral.interpreter.expressions.Number;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Interpreter* specifies how to evaluate sentences in a language.
// The basic idea is to have a class for each symbol (terminal or nonterminal) in a specialized computer language.
// The syntax tree of a sentence in the language is an instance of the composite pattern and
// is used to evaluate (interpret) the sentence for a client
public class Interpreter {
    private static String expression;

    public static void main(String[] args) {
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