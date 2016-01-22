package patterns.creational.factorymethod;

import samples.maze.Wall;
/**
 * Created by Nikita Shkaruba on 22.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Factory method is just a method to override(!) returning object. And *AbstractFactory* is a bunch of factory methods!
//
// Clarification for example below:
//      (1) - class consumer
//      (2) - class provider with factory method
//
// This pattern is true when: some consumer class(1) have functionality outside(from factory method in provider class(2))
// So consumer(1) requests an object from factory method of abstract(or not) provider(2) class.
// All this scheme is good because we can override provider class(2) with factory method to return different kind of objects!
public abstract class WallProvider {
    // factory method
    public abstract Wall getWall();
}

