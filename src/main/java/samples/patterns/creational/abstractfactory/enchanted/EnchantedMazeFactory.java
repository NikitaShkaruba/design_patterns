package samples.patterns.creational.abstractfactory.enchanted;

import samples.patterns.creational.abstractfactory.MazeFactory;
import samples.patterns.creational.workspace.Door;
import samples.patterns.creational.workspace.Maze;
import samples.patterns.creational.workspace.Room;
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

// Concrete class of an abstract factory
public class EnchantedMazeFactory implements MazeFactory {
    public Maze makeMaze() {
        return new Maze();
    }
    public Room makeRoom(int id) {
        return new Room(id);
    }

    // Enchanted Traits
    public Wall makeWall() {
        return (new Random().nextInt() % 10 == 0)? new EnchantedWall() : new Wall();
    }
    public Door makeDoor(Room from, Room to) {
        return (new Random().nextInt() % 10 == 0)? new EnchantedDoor(from, to, true) : new Door(from, to, new Random().nextBoolean()) ;
    }
}
