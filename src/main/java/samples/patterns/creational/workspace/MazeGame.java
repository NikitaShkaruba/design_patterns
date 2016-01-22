package samples.patterns.creational.workspace;

import samples.patterns.creational.abstractfactory.bombed.BombedRoom;
import samples.patterns.creational.abstractfactory.bombed.BombedWall;
import samples.patterns.creational.abstractfactory.enchanted.EnchantedMazeFactory;
import samples.patterns.creational.abstractfactory.*;
import samples.patterns.creational.builder.*;
import samples.patterns.creational.prototype.MazePrototypeFactory;

/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Main class which is a game itself!
// You can find comparison between creational patterns in createMaze methods!
public class MazeGame {
    public void main(String[] args) {
        Maze maze;

        switch(args[0]) {
            case "factory": maze = createMaze(new EnchantedMazeFactory());
            case "builder": maze = createMaze(new StandardMazeBuilder());
            case "prototype": maze = createMaze();
        }
        while(true) {
            // gameplay
        }
    }

    private Maze createMaze(MazeFactory factory) {
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
    private Maze createMaze(MazeBuilder builder) {
        // Builder encapsulates all the inner realization inside.
        // e.g.:Nobody even know about walls, all the logic inside builder!
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2) ;
        builder.buildDoor(1, 2);

        return builder.getMaze();
    }
    private Maze createMaze() {
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
}
