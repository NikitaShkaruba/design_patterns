package patterns.behavioral.strategy.behaviours;

import patterns.behavioral.strategy.RobotBehaviour;

public class DefensiveBehaviour implements RobotBehaviour {
    @Override
    public void moveCommand() {
        System.out.print("\t**> Current objective is *defencive* moving. If i'll find another robot, i'll run from him.");
    }
}
