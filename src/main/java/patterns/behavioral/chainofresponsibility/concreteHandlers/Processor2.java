package patterns.behavioral.chainofresponsibility.concreteHandlers;

import patterns.behavioral.chainofresponsibility.Handler;

// Concrete Handler
public class Processor2 extends Handler {
    public void HandleRequest(int request) {
        if (request >= 10 && request < 20)
            System.out.println(this.getClass().getName() + " handled request " + request);
        else
            if (successor != null)
                successor.HandleRequest(request);
    }
}
