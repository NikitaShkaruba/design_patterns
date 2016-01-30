package patterns.behavioral.command;

/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Command* encapsulates request as object allowing to:
//      * Set client's parameters for handling commands
//      * Enqueuing commands
//      * Log commands
//      * Cancel commands
public abstract class Command {
    // There could be invoker, receiver fields.

    public abstract void execute();
}
