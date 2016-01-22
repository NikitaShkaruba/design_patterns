package samples.patterns.creational.abstractfactory.enchanted;

import samples.patterns.creational.workspace.Wall;

import java.util.Random;
/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Wall extension, which is being supplied by abstract factory
public class EnchantedWall extends Wall {
    public boolean isPassable = new Random().nextBoolean();

    public void passThrough() {
        // logic
        //if (isPassable)
        //    Pass()
        //else
        //    ...
    }
}
