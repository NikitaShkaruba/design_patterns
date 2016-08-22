package patterns.behavioral.command.concreteCommands;

import patterns.behavioral.command.Command;

public class ActionCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Opening door!");
    }
}
