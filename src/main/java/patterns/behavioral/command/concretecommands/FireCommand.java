package patterns.behavioral.command.concretecommands;

import patterns.behavioral.command.Command;
/**
 * Created by Nikita Shkaruba on 30.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class FireCommand extends Command {
    @Override
    public void execute() {
        fire();
    }

    private void fire() {
        System.out.println("Firing!");
    }
}
