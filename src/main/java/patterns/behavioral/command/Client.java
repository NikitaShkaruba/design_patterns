package patterns.behavioral.command;

import patterns.behavioral.command.concretecommands.*;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class Client {
    public static void main(String[] args) {
        PS3Joystick joystick = new PS3Joystick(new FireCommand(), new SpecialCommand(), new ActionCommand(), new JumpCommand());

        System.out.println("Open the door to proceed");
        joystick.pressCircleButton();

        System.out.println("Shoot that Goliath now!");
        joystick.pressSquareButton();
    }
}
