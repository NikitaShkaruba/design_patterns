package patterns.structural.composite;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Special exception for leaves who don't want to compose another objects
public class CannotAddToLeafException extends Exception {
    public CannotAddToLeafException() {
        super("You Are trying to add component to leaf.");
    }
}
