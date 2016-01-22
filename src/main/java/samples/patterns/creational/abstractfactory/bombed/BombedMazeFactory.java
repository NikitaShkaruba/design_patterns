package samples.patterns.creational.abstractfactory.bombed;

import samples.patterns.creational.workspace.Door;
import samples.patterns.creational.workspace.Maze;
import samples.patterns.creational.workspace.Room;
import samples.patterns.creational.workspace.Wall;
import samples.patterns.creational.abstractfactory.MazeFactory;

import java.util.Random;

/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Concrete class of an abstract factory
public class BombedMazeFactory implements MazeFactory {
    public Maze makeMaze() {
        // Ad some Rooms with bombs

        return null;
    }
    public Door makeDoor(Room from, Room to) {
        return null;
    }

    // Bombed Traits
    public Room makeRoom(int id) {
        return (new Random().nextInt() % 10 == 0)? new BombedRoom(id) : new Room(id);
    }
    public Wall makeWall() {
        return (new Random().nextInt() % 10 == 0)? new BombedWall() : new Wall();
    }
}
