package patterns.behavioral.observer;

import java.util.ArrayList;

class SensorSystem {
    private ArrayList<AlarmListener> listeners = new ArrayList<>();

    public void register( AlarmListener al ) {
        listeners.add(al);
    }
    public void soundTheAlarm() {
        System.out.println("Sensor has detected infiltration. Raise the alarm!");

        for (AlarmListener listener: listeners)
            listener.alarm();
    }
}

