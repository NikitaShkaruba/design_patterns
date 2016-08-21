package patterns.behavioral.observer.listeners;

import patterns.behavioral.observer.AlarmListener;

public class Gate implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Closing the gate!");
    }
}
