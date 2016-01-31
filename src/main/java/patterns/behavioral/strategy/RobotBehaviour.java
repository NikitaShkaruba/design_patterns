package patterns.behavioral.strategy;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Strategy* defines a family of algorithms, encapsulate each one, and make them interchangeable.
// Strategy lets the algorithm vary independently from the clients that use it.
public interface RobotBehaviour {
    void moveCommand();
}
