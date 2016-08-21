package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Pattern *Memento* is a magic cookie that encapsulates a "check point" capability
 * Memento objects without violating encapsulation, capture and externalize an object's internal state
 * so that the object can be returned to this state later
 */
class MementoShowcase {
    public static void main(String[] args) {
        List<Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveAsMemento());

        originator.set("State3");
        savedStates.add(originator.saveAsMemento());
        originator.set("State4");

        // We can request multiple mementos, and choose which one to roll back to.
        originator.restoreFromMemento(savedStates.get(1));
    }
}
