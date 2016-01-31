package patterns.behavioral.strategy;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

// Strategy user
public class Robot {
    RobotBehaviour behaviour;
    String name;

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
        // ... send the command to mechanisms
        behaviour.moveCommand();
        System.out.println(this.name + " starts moving.");
    }
}
