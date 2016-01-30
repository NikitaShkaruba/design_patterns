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
public class Number implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int interpret(Map<String,Expression> variables) {
        return number;
    }
}
