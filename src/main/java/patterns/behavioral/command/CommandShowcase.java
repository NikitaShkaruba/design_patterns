package patterns.behavioral.command;

import patterns.behavioral.command.concreteCommands.*;

/**
 * Pattern *Command* encapsulate a request as an object, thereby allowing for the parameterization of clients with
 * different requests, and the queuing or logging of requests. It also allows for the support of undoable operations.
 */
public class CommandShowcase {
    public static void main(String[] args) {
        PS3Joystick joystick = new PS3Joystick(new FireCommand(), new SpecialCommand(), new ActionCommand(), new JumpCommand());

        System.out.println("Open the door to proceed");
        joystick.pressCircleButton();

        System.out.println("Shoot that monster now!");
        joystick.pressSquareButton();
    }
}
