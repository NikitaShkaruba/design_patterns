package patterns.behavioral.chainofresponsibility;

/**
 * Created by Nikita Shkaruba on 27.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Interface for chain elements
public abstract class Handler {
    protected Handler successor;

    public void SetSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}