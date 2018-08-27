package main.java.structural.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements ChatMediator {
    private List<User> users;

    public MediatorImpl(){
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for(User u: users) {
            if(u != user) {
                u.receive(message);
            }
        }
    }
}
