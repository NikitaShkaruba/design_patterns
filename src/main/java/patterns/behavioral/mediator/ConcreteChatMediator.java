package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Nikita Shkaruba on 31.01.16.
 * <p>
 * My Contacts:
 * Email: sh.nickita@list.ru
 * GitHub: github.com/SigmaOne
 * Vk: vk.com/wavemeaside
 */

public class ConcreteChatMediator implements ChatMediator {
    private List<User> users = new ArrayList<>();

    public ConcreteChatMediator() {

    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
    @Override
    public void sendMessage(String msg, User user) {
        for(User u : this.users){
            if(u != user){
                u.receive(msg);
            }
        }
    }
}