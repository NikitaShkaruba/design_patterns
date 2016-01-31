package patterns.behavioral.state;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *State* allows an object to alter its behavior when its internal state changes.
class CeilingFanPullChain {
    private int currentState = 0;

    public void pull() {
        switch (currentState) {
            case 0: {
                currentState = 1;
                System.out.println("low speed");
                break;
            }
            case 1: {
                currentState = 2;
                System.out.println("medium speed");
                break;
            }
            case 2: {
                currentState = 3;
                System.out.println("high speed");
                break;
            }
            case 3: {
                currentState = 0;
                System.out.println("turning off");
                break;
            }
        }
    }
}
