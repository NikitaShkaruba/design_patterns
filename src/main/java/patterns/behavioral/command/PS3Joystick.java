package patterns.behavioral.command;

// Commands of this class may differ
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
