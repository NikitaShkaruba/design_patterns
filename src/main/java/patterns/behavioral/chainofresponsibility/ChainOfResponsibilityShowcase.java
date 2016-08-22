package patterns.behavioral.chainofresponsibility;

import patterns.behavioral.chainofresponsibility.concreteHandlers.*;

/**
 * Chain of responsibility allows to avoid coupling the sender of a request to its receiver
 * by giving more than one object a chance to handle the request.
*/
public class ChainOfResponsibilityShowcase {
    public static void main(String[] args) {
        Handler h1 = new Processor1();
        Handler h2 = new Processor2();
        Handler h3 = new Processor3();

        h1.SetSuccessor(h2);
        h2.SetSuccessor(h3);

        // Generate and process request
        int[] requests = { 2, 5, 14, 22, 18, 3, 27, 20 };

        for(int request: requests)
            h1.HandleRequest(request);
    }
}
