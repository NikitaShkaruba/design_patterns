package samples.patterns.creational.abstractfactory.bombed;

import samples.patterns.creational.workspace.Wall;
/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Wall extension, which is being supplied by Bombed abstract factory
public class BombedWall extends Wall {
    public void blowUp() {
        // logic
    }
}
