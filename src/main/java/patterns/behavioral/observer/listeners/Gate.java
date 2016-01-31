package patterns.behavioral.observer.listeners;

import patterns.behavioral.observer.AlarmListener;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Gate implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Closing the gate!");
    }
}
