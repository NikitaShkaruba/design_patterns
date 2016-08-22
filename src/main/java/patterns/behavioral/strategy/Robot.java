package patterns.behavioral.strategy;

// Strategy pattern user
public class Robot {
    private RobotBehaviour behaviour;
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void setBehaviour(RobotBehaviour behaviour) {
        this.behaviour = behaviour;
    }
    public RobotBehaviour getBehaviour() {
        return behaviour;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        behaviour.moveCommand();
        System.out.println(this.name + " starts moving.");
    }
}
