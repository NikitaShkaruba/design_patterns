package patterns.behavioral.memento;

class Originator {
    private String state;

    public void set(String state) {
        System.out.println("Originator: Setting state to " + state);
        this.state = state;
    }
    public Memento saveAsMemento() {
        System.out.println("Originator: Saving to Memento.");
        return new Memento(this.state);
    }
    public void restoreFromMemento(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: State after restoring from Memento: " + state);
    }
}