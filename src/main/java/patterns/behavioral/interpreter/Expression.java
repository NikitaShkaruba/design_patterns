package patterns.behavioral.interpreter;

import java.util.Map;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Basic interface
public interface Expression {
    int interpret(Map<String,Expression> variables);
}

