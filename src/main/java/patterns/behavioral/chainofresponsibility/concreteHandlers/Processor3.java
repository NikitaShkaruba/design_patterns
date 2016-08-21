package patterns.behavioral.chainofresponsibility.concreteHandlers;

import patterns.behavioral.chainofresponsibility.Handler;

// Concrete Handler
public class Processor3 extends Handler {
    public void HandleRequest(int request) {
        if (request >= 20 && request < 30)
            System.out.println(this.getClass().getName() + " handled request " + request);
        else
            if (successor != null)
                successor.HandleRequest(request);
    }
}
