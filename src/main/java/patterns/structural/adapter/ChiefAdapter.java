package patterns.structural.adapter;

/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Adapter* converts wrong interface of one class to target interface of another class, which clients are expecting
// Adapter provides cooperation between classes with different interfaces
// In java it could be implemented via inheritance(1) or composition(2)
// Inherited adapter sometimes cannot be implemented because java have not multiple inheritance.

// 1. Inherited
public class ChiefAdapter extends Plumber implements Chief {
    @Override
    public Object makeBreakfast() {
        return this.getGasket();
    }
    @Override
    public Object makeLunch() {
        return this.getPipe();
    }
    @Override
    public Object makeDinner() {
        return this.getScrewNut();
    }
}

// 2. Composed
class ChiefAdapter2 implements Chief {
    Plumber adaptee = new Plumber();

    @Override
    public Object makeBreakfast() {
        return adaptee.getGasket();
    }
    @Override
    public Object makeLunch() {
        return adaptee.getPipe();
    }
    @Override
    public Object makeDinner() {
        return adaptee.getScrewNut();
    }
}
