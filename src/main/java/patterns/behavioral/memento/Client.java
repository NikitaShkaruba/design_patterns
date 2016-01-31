package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

class Client {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();

        Originator originator = new Originator();
        originator.set("State1");
        originator.set("State2");
        savedStates.add(originator.saveToMemento());

        originator.set("State3");
        savedStates.add(originator.saveToMemento());
        originator.set("State4");

        // We can request multiple mementos, and choose which one to roll back to.
        originator.restoreFromMemento(savedStates.get(1));
    }
}
