package patterns.behavioral.observer;

import patterns.behavioral.observer.listeners.Lighting;
import patterns.behavioral.observer.listeners.Gate;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main( String[] args ) {
        SensorSystem ss = new SensorSystem();
        ss.register(new Gate());
        ss.register(new Lighting());

        ss.soundTheAlarm();
    }
}

