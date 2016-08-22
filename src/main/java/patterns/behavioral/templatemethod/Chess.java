package patterns.behavioral.templatemethod;

public class Chess extends Game {
    @Override
    public void doInitializeGame() {
        // Initialize player, then put the pieces on the board
    }
    @Override
    public void doMakePlay(int player) {
        // Process a turn for the player
    }
    @Override
    public boolean doIsEndOfGame() {
        // Return true if in Checkmate or Stalemate has been reached
        return false;
    }
    @Override
    public void doPrintWinner() {
        // Display the winning player logic
    }

    /* Specific declarations for the chess game. */
    // ...
}
