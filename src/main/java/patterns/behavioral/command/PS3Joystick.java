package patterns.behavioral.command;

/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class PS3Joystick {
    private Command squareCommand;
    private Command triangleCommand;
    private Command circleCommand;
    private Command crossCommand;

    public PS3Joystick(Command squareCommand, Command triangleCommand, Command circleCommand, Command crossCommand) {
        this.squareCommand = squareCommand;
        this.triangleCommand = triangleCommand;
        this.circleCommand = circleCommand;
        this.crossCommand = crossCommand;
    }

    public void pressSquareButton() {
        squareCommand.execute();
    }
    public void pressTriangleButton() {
        triangleCommand.execute();
    }
    public void pressCircleButton() {
        circleCommand.execute();
    }
    public void pressCrossButton() {
        crossCommand.execute();
    }
}
