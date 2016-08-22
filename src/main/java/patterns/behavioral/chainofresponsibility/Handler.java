package patterns.behavioral.chainofresponsibility;

// General interface for *Chaining elements*
public abstract class Handler {
    protected Handler successor;

    void SetSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void HandleRequest(int request);
}