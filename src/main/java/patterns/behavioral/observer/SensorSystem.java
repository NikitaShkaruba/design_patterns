package patterns.behavioral.observer;

import java.util.Vector;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Observer* defines a one-to-many dependency between objects so that when one object changes state,
// all its dependents are notified and updated automatically.
// Observer is the "View" part of Model-View-Controller.
class SensorSystem {
    private Vector<AlarmListener> listeners = new Vector();

    public void register( AlarmListener al ) {
        listeners.addElement(al);
    }
    public void soundTheAlarm() {
        System.out.println("Sensor has detected infiltration. Raise the alarm!");

        for (AlarmListener listener: listeners)
            listener.alarm();
    }
}

