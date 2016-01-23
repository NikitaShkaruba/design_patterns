package patterns.structural.adapter;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Final interface(target) user
public class Client {
    public static void eat(Object food) {
        // logic
    }
    public static void callAmbulance() {
        System.out.println("I ate some metal!(");
    }

    public static void main(String[] args) {
        Chief chief = new ChiefAdapter();

        Object dish = chief.makeBreakfast();
        eat(dish);

        dish = chief.makeLunch();
        eat(dish);

        dish = chief.makeDinner();
        eat(dish);
    }
}
