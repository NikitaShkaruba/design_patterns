package samples.patterns.creational.abstractfactory.bombed;

import samples.patterns.creational.workspace.Room;
/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Room extension, which is being supplied by abstract factory
public class BombedRoom extends Room {
    public BombedRoom(int id) {
        super(id);
    }

    // Special ones!
    @Override
    public void enter() {
        setTimer();
        // give 3 seconds to leave it
    }
    private void setTimer() {
        // Logic
    }
}
