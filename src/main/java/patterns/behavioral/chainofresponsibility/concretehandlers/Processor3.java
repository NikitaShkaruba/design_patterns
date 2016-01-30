package patterns.behavioral.chainofresponsibility.concretehandlers;

import patterns.behavioral.chainofresponsibility.Handler;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Concrete Handler
public class Processor3 extends Handler {
    public void HandleRequest(int request) {
        if (request >= 20 && request < 30)
            System.out.println(this.getClass().getName() + " handled request " + request);
        else if (successor != null)
            successor.HandleRequest(request);
    }
}
