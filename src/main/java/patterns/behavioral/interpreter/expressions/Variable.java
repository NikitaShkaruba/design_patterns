package patterns.behavioral.interpreter.expressions;

import patterns.behavioral.interpreter.Expression;
import java.util.Map;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Concrete expression
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Map<String,Expression> variables)  {
        if (variables.get(name) == null)
            return 0;

        //Either return new Number(0).
        return variables.get(name).interpret(variables);
    }
}
