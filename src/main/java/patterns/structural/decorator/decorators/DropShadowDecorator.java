package patterns.structural.decorator.decorators;

import patterns.structural.decorator.Decorator;
import patterns.structural.decorator.VisualComponent;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Decorator implementation 2
public class DropShadowDecorator extends Decorator {
    public DropShadowDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        component.draw();
        dropShadow();
    }

    private void dropShadow() {
        // logic
    }
}