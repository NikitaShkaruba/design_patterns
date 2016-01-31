package patterns.behavioral.memento;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Memento* is a magic cookie that encapsulates a "check point" capability
// Memento objects without violating encapsulation, capture and externalize an object's internal state so
// that the object can be returned to this state later
class Originator {
    private String state;
    // The class could also contain additional data that is not part of the
    // state saved in the memento..

    public void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }
    public Memento saveToMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }

    public static class Memento {
        private final String state;

        public Memento(String stateToSave) {
            state = stateToSave;
        }
        public String getSavedState() {
            return state;
        }
    }
}