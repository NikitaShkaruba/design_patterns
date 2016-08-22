package patterns.behavioral.chainofresponsibility.concreteHandlers;

import patterns.behavioral.chainofresponsibility.Handler;

public class Processor1 extends Handler {
    public void HandleRequest(int request) {
        if (request >= 0 && request < 10)
            System.out.println(this.getClass().getName() + " handled request " + request);
        else
            if (successor != null)
                successor.HandleRequest(request);
    }
}
