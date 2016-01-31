package patterns.behavioral.templatemethod;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Monopoly extends Game {
    // Implementation of necessary concrete methods
    @Override
    public void doInitializeGame() {
        // Initialize players
        // Initialize money
    }
    @Override
    public void doMakePlay(int player) {
        // Process one turn of player
    }
    @Override
    public boolean doIsEndOfGame() {
        // Return true if game is over
        // according to Monopoly rules
        return false;
    }
    @Override
    public void doPrintWinner() {
        // Display who won
    }

    /* Other specific declarations for the Monopoly game. */
    // ...
}
