package patterns.behavioral.strategy;

import patterns.behavioral.strategy.behaviours.*;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main(String[] args) {
        Robot r1 = new Robot("Big Robot");
        r1.setBehaviour(new AggressiveBehaviour());

        Robot r2 = new Robot("George v.2.1");
        r2.setBehaviour(new DefensiveBehaviour());

        Robot r3 = new Robot("R2D2");
        r3.setBehaviour(new NormalBehaviour());

        r1.move();
        r2.move();
        r3.move();

        System.out.println("\r\nNew behaviours: " +
                "\r\n\t'Big Robot' gets really scared" +
                "\r\n\t'George v.2.1' becomes really mad because it's always attacked by other robots" +
                "\r\n\t'R2D2' keeps its calm\r\n");
        r1.setBehaviour(new DefensiveBehaviour());
        r2.setBehaviour(new AggressiveBehaviour());

        r1.move();
        r2.move();
        r3.move();
    }
}