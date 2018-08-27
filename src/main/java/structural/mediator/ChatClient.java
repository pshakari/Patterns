package main.java.structural.mediator;

public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new MediatorImpl();
        User user = new UserImpl("Nils",mediator);
        User user2 = new UserImpl("Ola",mediator);
        User user3 = new UserImpl("Kari",mediator);
        User user4 = new UserImpl("Ali",mediator);
        mediator.addUser(user);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user.send("Hello everybody");
        user2.receive("Halllloo");
        user3.send("Good day");

    }
}
