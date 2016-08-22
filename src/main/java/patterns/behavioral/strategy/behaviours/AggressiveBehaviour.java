package patterns.behavioral.strategy.behaviours;

import patterns.behavioral.strategy.RobotBehaviour;

public class AggressiveBehaviour implements RobotBehaviour {
    @Override
    public void moveCommand() {
        System.out.print("\t**> Current objective is *aggressive* moving. If i find another robot, i'll attack him.");
    }
}
