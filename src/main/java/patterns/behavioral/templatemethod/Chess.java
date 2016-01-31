package patterns.behavioral.templatemethod;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Chess extends Game {
    // Implementation of necessary concrete methods
    @Override
    public void doInitializeGame() {
        // Initialize players
        // Put the pieces on the board
    }
    @Override
    public void doMakePlay(int player) {
        // Process a turn for the player
    }
    @Override
    public boolean doIsEndOfGame() {
        // Return true if in Checkmate or
        // Stalemate has been reached
        return false;
    }
    @Override
    public void doPrintWinner() {
        // Display the winning player
    }

    /* Specific declarations for the chess game. */
    // ...
}
