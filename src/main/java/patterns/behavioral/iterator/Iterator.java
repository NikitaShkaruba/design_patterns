package patterns.behavioral.iterator;

/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Iterator* encapsulates inner traverse logic, providing easy interface for clients
public interface Iterator {
    boolean hasNext();
    Object next();
}
