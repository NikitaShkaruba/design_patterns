package patterns.structural.decorator;

import patterns.structural.decorator.decorators.BorderDecorator;
import patterns.structural.decorator.decorators.DropShadowDecorator;
import patterns.structural.decorator.decorators.ScrollDecorator;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Final client
public class Window {
    private static VisualComponent content;

    public static void setContent(VisualComponent component) {
        Window.content = component;
    }
    private static void showContent() {
        // logic
    }
    private static void hideContent() {
        // logic
    }

    public static void main(String[] args) {
        TextView textView = new TextView();

        // Create simple TextView
        setContent(textView);
        showContent();

        // Create TextView with Shadow
        setContent(new BorderDecorator(textView));
        showContent();

        // Create TextView With thick border
        hideContent();
        setContent(new BorderDecorator(new BorderDecorator(textView)));
        showContent();

        // Create TextView with border, scroll and shadow!
        hideContent();
        setContent(new BorderDecorator(new ScrollDecorator(new DropShadowDecorator(textView))));
        showContent();
    }
}
