package patterns.creational.abstractfactory.enchanted;

import samples.maze.*;
/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// It's like a portal
public class EnchantedDoor extends Door {
    public EnchantedDoor(Room room1, Room room2, boolean isOpen) {
        super(room1, room2, isOpen);
    }

    @Override
    public void open() {
        puf();
    }
    private void puf() {
        // And you have entered your room;
        Room temp = room1;
        room1 = room2;
        room2 = temp;
    }
}
