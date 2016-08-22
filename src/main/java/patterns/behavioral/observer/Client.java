package patterns.behavioral.observer;

import patterns.behavioral.observer.listeners.*;

/**
 * Pattern *Observer* defines a one-to-many dependency between objects so that when one object changes state,
 * all its dependents are notified and updated automatically.
 *
 * Observer is the "View" part of Model-View-Controller.
 */
public class Client {
    public static void main( String[] args ) {
        SensorSystem ss = new SensorSystem();
        ss.register(new Gate());
        ss.register(new Lighting());

        ss.soundTheAlarm();
    }
}

