package patterns.behavioral.chainofresponsibility.concretehandlers;

import patterns.behavioral.chainofresponsibility.Handler;
/**
 * Created by Nikita Shkaruba on 27.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Concrete Handler
public class Processor2 extends Handler {
    public void HandleRequest(int request) {
        if (request >= 10 && request < 20)
            System.out.println(this.getClass().getName() + " handled request " + request);
        else if (successor != null)
            successor.HandleRequest(request);
    }
}
