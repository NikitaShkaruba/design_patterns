package samples.maze;

import patterns.creational.abstractfactory.bombed.BombedRoom;
import patterns.creational.abstractfactory.bombed.BombedWall;
import patterns.creational.abstractfactory.enchanted.EnchantedMazeFactory;
import patterns.creational.abstractfactory.*;
import patterns.creational.builder.*;
import patterns.creational.prototype.MazePrototypeFactory;
import patterns.creational.singleton.SingleMazeFactory;

/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Main class which is a game itself!
// You can find comparison between creational patterns in createMaze* methods!
public class MazeGame {
    public void main(String[] args) {
        Maze maze;

        switch(args[0]) {
            case "factory": maze = createMazeWithAbstractFactory(new EnchantedMazeFactory());
            case "builder": maze = createMazeWithMazeBuilder(new StandardMazeBuilder());
            case "prototype": maze = createMazeWithPrototypeFactory();
            case "singleton": maze = createMazeWithSingletonFactory();
        }
        while(true) {
            // gameplay
        }
    }

    private Maze createMazeWithAbstractFactory(MazeFactory factory) {
        // Factory simply supplies components for usage, nothing more. And then we build logic with them!
        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door door12 = factory.makeDoor(r1, r2 ) ;

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, factory.makeWall());
        r1.setSide(Direction.WEST, factory.makeWall());
        r1.setSide(Direction.SOUTH, door12);
        r1.setSide(Direction.EAST, factory.makeWall());

        r1.setSide(Direction.NORTH, door12);
        r1.setSide(Direction.WEST, factory.makeWall());
        r1.setSide(Direction.SOUTH, factory.makeWall());
        r1.setSide(Direction.EAST, factory.makeWall());

        return maze;
    }
    private Maze createMazeWithMazeBuilder(MazeBuilder builder) {
        // Builder encapsulates all the inner realization inside.
        // e.g.:Nobody even know about walls, all the logic inside builder!
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2) ;
        builder.buildDoor(1, 2);

        return builder.getMaze();
    }
    private Maze createMazeWithPrototypeFactory() {
        // Prototype is an instance to be cloned and then returned
        // Prototype factory clones and then returns prototypes(objects) with which it has been initialized
        MazePrototypeFactory bombedFactory = new MazePrototypeFactory(
                new Maze(),
                new BombedWall(),
                new BombedRoom(0),
                new Door(new BombedRoom(0), new BombedRoom(0), true)
        );

        Maze maze = bombedFactory.makeMaze();
        Room r1 = bombedFactory.makeRoom(1);
        Room r2 = bombedFactory.makeRoom(2);
        Door door12 = bombedFactory.makeDoor(r1, r2 ) ;

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, bombedFactory.makeWall());
        r1.setSide(Direction.WEST, bombedFactory.makeWall());
        r1.setSide(Direction.SOUTH, door12);
        r1.setSide(Direction.EAST, bombedFactory.makeWall());

        r1.setSide(Direction.NORTH, door12);
        r1.setSide(Direction.WEST, bombedFactory.makeWall());
        r1.setSide(Direction.SOUTH, bombedFactory.makeWall());
        r1.setSide(Direction.EAST, bombedFactory.makeWall());

        return maze;
    }
    private Maze createMazeWithSingletonFactory() {
        SingleMazeFactory factory = SingleMazeFactory.getInstance();

        Maze maze = factory.makeMaze();
        Room r1 = factory.makeRoom(1);
        Room r2 = factory.makeRoom(2);
        Door door12 = factory.makeDoor(r1, r2 ) ;

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Direction.NORTH, factory.makeWall());
        r1.setSide(Direction.WEST, factory.makeWall());
        r1.setSide(Direction.SOUTH, door12);
        r1.setSide(Direction.EAST, factory.makeWall());

        r1.setSide(Direction.NORTH, door12);
        r1.setSide(Direction.WEST, factory.makeWall());
        r1.setSide(Direction.SOUTH, factory.makeWall());
        r1.setSide(Direction.EAST, factory.makeWall());

        return maze;
    }
}
