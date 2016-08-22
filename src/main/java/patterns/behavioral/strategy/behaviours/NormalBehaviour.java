package patterns.behavioral.strategy.behaviours;

import patterns.behavioral.strategy.RobotBehaviour;

public class NormalBehaviour implements RobotBehaviour {
    @Override
    public void moveCommand() {
        System.out.print("\t**> Current objective is *normal* moving. If i'll find another robot, i'll ignore him. ");
    }
}
