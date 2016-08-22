package patterns.behavioral.templatemethod;

public class Monopoly extends Game {
    // Implementation of necessary concrete methods
    @Override
    public void doInitializeGame() {
        // Initialize players , then initialize money
    }
    @Override
    public void doMakePlay(int player) {
        // Process one turn of player
    }
    @Override
    public boolean doIsEndOfGame() {
        // Return true if game is over according to Monopoly rules
        return false;
    }
    @Override
    public void doPrintWinner() {
        // Display who is winner
    }

    /* Other specific declarations for the Monopoly game. */
    // ...
}
