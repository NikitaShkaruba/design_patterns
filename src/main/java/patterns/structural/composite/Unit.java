package patterns.structural.composite;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Basic interface of a component
public interface Unit {
    int getStrength();
    void addUnit(Unit unit) throws CannotAddToLeafException;
}
