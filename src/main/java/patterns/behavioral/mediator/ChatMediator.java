package patterns.behavioral.mediator;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Mediator* is an object that encapsulates how a set of objects interact
// Good example is an airport station. Planes doesn't interact with each others, but they interact with main station,
// which knows statuses of every plane.
public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}