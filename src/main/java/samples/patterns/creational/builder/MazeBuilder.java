package samples.patterns.creational.builder;

import samples.patterns.creational.workspace.Maze;
/**
 * Created by Nikita Shkaruba on 21.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Pattern *Builder* encapsulates all the inner realization inside, providing interface for constructing.
public interface MazeBuilder {
    Maze getMaze();

    void buildMaze();
    void buildRoom(int id);
    void buildDoor(int from, int to);
}
