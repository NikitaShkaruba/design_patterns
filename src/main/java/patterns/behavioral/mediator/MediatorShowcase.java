package patterns.behavioral.mediator;

import patterns.behavioral.mediator.concreteImplementations.ConcreteChatMediator;
import patterns.behavioral.mediator.concreteImplementations.ConcreteUser;

/**
 * Pattern *Mediator* defines an object that encapsulates how a set of objects interact.
 * Mediator promotes loose coupling by keeping objects from referring to each other explicitly,
 * and it allows their interaction to vary independently
 *
 * Good example is an airport station. Planes doesn't interact with each others,
 * but they do interact with main station, which knows statuses of every plane.
 */
public class MediatorShowcase {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        User user1 = new ConcreteUser(mediator, "Panka");
        User user2 = new ConcreteUser(mediator, "Lisa");
        User user3 = new ConcreteUser(mediator, "Sauron");
        User user4 = new ConcreteUser(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}