package patterns.behavioral.mediator;

/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        User user1 = new ConcreteUser(mediator, "Pankaj");
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