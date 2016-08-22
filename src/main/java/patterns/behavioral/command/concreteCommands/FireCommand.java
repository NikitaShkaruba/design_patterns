package patterns.behavioral.command.concreteCommands;

import patterns.behavioral.command.Command;

public class FireCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Firing!");
    }
}
