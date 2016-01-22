package patterns.creational.factorymethod;

import patterns.creational.abstractfactory.bombed.BombedWall;
import samples.maze.Wall;
/**
 * Created by Nikita Shkaruba on 23.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

class BombedWallProvider extends WallProvider {
    @Override
    public Wall getWall() {
        return new BombedWall();
    }
}
