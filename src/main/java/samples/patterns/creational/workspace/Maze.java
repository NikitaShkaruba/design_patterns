package samples.patterns.creational.workspace;

import java.util.ArrayList;

/**
 * Created by Nikita Shkaruba on 20.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */
public class Maze {
    private ArrayList<Room> rooms;
    private ArrayList<Door> doors;

    public Maze() {}

    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void addDoor(Door door) {
        doors.add(door);
    }
    public Room findRoom(int id) {
        // logic
        return rooms.get(id);
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public ArrayList<Door> getDoors() {
        return doors;
    }
    public Maze clone() {
        Maze clone = new Maze();

        for (int i = 0; i < rooms.size(); i++)
            clone.rooms.add(rooms.get(i).clone());
        for (int i = 0; i < doors.size(); i++) {
            Door clonedDoor = doors.get(i);
            clone.doors.add(clonedDoor.clone(rooms.get(clonedDoor.room1.getId()), rooms.get(clonedDoor.room2.getId())));
        }
        return clone;
    }
}
