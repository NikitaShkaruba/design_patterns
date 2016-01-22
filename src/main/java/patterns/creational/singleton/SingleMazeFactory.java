package patterns.creational.singleton;

import samples.maze.*;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern ensures that there is only one instance of the class.
// Could be used when you need access to an instance from everywhere!
public class SingleMazeFactory {
    private static SingleMazeFactory instance = null;

    protected SingleMazeFactory() {

    }

    public static SingleMazeFactory getInstance() {
        if (instance == null)
            instance = new SingleMazeFactory();

        return instance;
    }
    public Maze makeMaze() {
        return new Maze();
    }
    public Room makeRoom(int id) {
        return new Room(id);
    }
    public Wall makeWall() {
        return new Wall();
    }
    public Door makeDoor(Room from, Room to) {
        return new Door(from, to, true);
    }
}
