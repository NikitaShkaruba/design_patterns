package patterns.behavioral.mediator.concreteImplementations;

import patterns.behavioral.mediator.ChatMediator;
import patterns.behavioral.mediator.User;

import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator implements ChatMediator {
    private List<User> users = new ArrayList<>();

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