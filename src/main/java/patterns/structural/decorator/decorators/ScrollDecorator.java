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

// Decorator implementation 3
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(VisualComponent component) {
        super(component);
    }

    @Override
    public void draw() {
        component.draw();
        drawScroller();
    }
    public void handleScrolling() {
        //logic
    }

    private void drawScroller() {
        // logic
    }
}