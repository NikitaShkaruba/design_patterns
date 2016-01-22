package samples.patterns.creational.prototype;

import samples.patterns.creational.abstractfactory.MazeFactory;
import samples.patterns.creational.workspace.Door;
import samples.patterns.creational.workspace.Maze;
import samples.patterns.creational.workspace.Room;
import samples.patterns.creational.workspace.Wall;

/**
 * Created by Nikita Shkaruba on 22.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */
public class MazePrototypeFactory implements MazeFactory {
    private Maze prototypeMaze;
    private Wall prototypeWall;
    private Room prototypeRoom;
    private Door prototypeDoor;

    public MazePrototypeFactory(Maze prototypeMaze, Wall prototypeWall, Room prototypeRoom, Door prototypeDoor) {
        this.prototypeMaze = prototypeMaze;
        this.prototypeWall = prototypeWall;
        this.prototypeRoom = prototypeRoom;
        this.prototypeDoor = prototypeDoor;
    }

    @Override
    public Maze makeMaze() {
        return prototypeMaze.clone();
    }
    @Override
    public Room makeRoom(int id) {
        Room product = prototypeRoom.clone();
        product.setId(id);
        return product;
    }
    @Override
    public Door makeDoor(Room from, Room to) {
        return prototypeDoor.clone(from, to);
    }
    @Override
    public Wall makeWall() {
        return prototypeWall.clone();
    }
}
