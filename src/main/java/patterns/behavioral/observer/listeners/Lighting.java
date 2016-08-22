package patterns.behavioral.observer.listeners;

import patterns.behavioral.observer.AlarmListener;

public class Lighting implements AlarmListener {
    @Override
    public void alarm() {
        System.out.println("Lights up!");
    }
}
