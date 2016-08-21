package patterns.behavioral.command.concreteCommands;

import patterns.behavioral.command.Command;

public class JumpCommand extends Command {
    @Override
    public void execute() {
        System.out.println("Jumping!");
    }
}
