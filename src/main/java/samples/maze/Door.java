package samples.maze;

/**
 * Created by Nikita Shkaruba on 20.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */
public class Door implements MapSite{
    protected Room room1, room2;
    protected boolean isOpen;

    public Door(Room room1, Room room2, boolean isOpen) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = isOpen;
    }

    public void open() {
        // logic
    }
    public void enter() {
        // logic
    }
    public Door clone(Room clonedRoom1, Room clonedRoom2) {
        return new Door(clonedRoom1, clonedRoom2, isOpen);
    }
}
