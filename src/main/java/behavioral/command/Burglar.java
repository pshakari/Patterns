package main.java.behavioral.command;

//client
public class Burglar {

    public static void main(String[] args) {
        Door door = new Door();
        ICommand doorOpen = new OpenCommand(door);
        ICommand doorClose = new CloseCommand(door);
        Remote remote = new Remote(doorOpen, doorClose);
        remote.clickOpen();
        remote.clickClose();
    }
}
