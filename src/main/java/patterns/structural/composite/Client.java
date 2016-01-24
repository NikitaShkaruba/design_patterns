package patterns.structural.composite;

import patterns.structural.composite.units.Archer;
import patterns.structural.composite.units.Horseman;
import patterns.structural.composite.units.Infantryman;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// End client
public class Client {
    public static void main(String[] args) {
        CompositeUnit army = new CompositeUnit();

        for (int i = 0; i< 4; i++)
            army.addUnit(createLegion());

        System.out.println("Rome army strength is: " + army.getStrength());
    }

    private static Unit createLegion() {
        // Rome Legion have
        CompositeUnit legion = new CompositeUnit();

        // 3000 Infantry man
        for (int i=0; i<3000; ++i)
            legion.addUnit(new Infantryman());
        // 1200 Archers
        for (int i=0; i<1200; ++i)
            legion.addUnit(new Archer());
        // 300 Horseman
        for (int i=0; i<300; ++i)
            legion.addUnit(new Horseman());

        return legion;
    }
}
