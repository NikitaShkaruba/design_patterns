package samples.patterns.creational.abstractfactory;

import samples.patterns.creational.workspace.Door;
import samples.patterns.creational.workspace.Maze;
import samples.patterns.creational.workspace.Room;
import samples.patterns.creational.workspace.Wall;

/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Abstract factory itself, simply providing interface for concreteFactories.
// Abstract factory is a bunch of factory methods.
// Every concrete factory just providing objects to use, each in it's own way!
// Because of polymorphism, everything works fine, but we have to cast objects to themselves sometimes :\
public interface MazeFactory {
    Maze makeMaze();

    Room makeRoom(int id);
    Door makeDoor(Room from, Room to);
    Wall makeWall();
}
