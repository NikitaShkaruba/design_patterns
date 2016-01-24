package patterns.structural.decorator;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Decorator* dynamically adds new responsibilities to a class.
// Occurs as a flexible alternative of creation a new subclass for new functionality.
public abstract class Decorator implements VisualComponent {
    protected VisualComponent component;

    public Decorator(VisualComponent component) {
        this.component = component;
    }

    @Override
    public abstract void draw();
    @Override
    public void resize() {
        component.resize();
    }
}
