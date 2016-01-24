package patterns.structural.decorator;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Mutual interface for real object and his decorator
public interface VisualComponent {
    void draw();
    void resize();
}
