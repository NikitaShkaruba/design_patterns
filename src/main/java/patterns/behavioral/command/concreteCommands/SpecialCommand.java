package patterns.behavioral.command.concreteCommands;

import patterns.behavioral.command.Command;

public class SpecialCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Throwing grenade!");
    }
}
