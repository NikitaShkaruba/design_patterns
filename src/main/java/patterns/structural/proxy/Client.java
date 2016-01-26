package patterns.structural.proxy;

/**
 * Created by Nikita Shkaruba on 26.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

class Client {
    public static void main(String[] args) {
        final Image image = new ProxyImage("BearEatsDeer.png");

        image.displayImage(); // loading photo, then displaying photo
        image.displayImage(); // displaying photo
        image.displayImage(); // displaying photo
    }
}