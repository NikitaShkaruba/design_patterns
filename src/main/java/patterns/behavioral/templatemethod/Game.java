package patterns.behavioral.templatemethod;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

/* Pattern *Template method* defines the skeleton of an algorithm in an operation, deferring some steps to client subclasses.
   Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
   Base class kinda declares algorithm 'placeholders', and derived classes implement the them */
public abstract class Game {
    // Hook methods. Concrete implementation may differ in each subclass
    protected int playersCount;
    abstract void doInitializeGame();
    abstract void doMakePlay(int player);
    abstract boolean doIsEndOfGame();
    abstract void doPrintWinner();

    // Template method
    public final void playOneGame(int playersCount) {
        this.playersCount = playersCount;
        doInitializeGame();

        int j = 0;
        while (!doIsEndOfGame()) {
            doMakePlay(j);
            j = (j + 1) % playersCount;
        }
        doPrintWinner();
    }
}
