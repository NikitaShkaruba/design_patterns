package patterns.structural.adapter;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Adaptee, class with right logic, but wrong interface
public class Plumber {
    public Object getScrewNut() {
        return new Object();
    }
    public Object getPipe() {
        return new Object();
    }
    public Object getGasket() {
        return new Object();
    }
}
