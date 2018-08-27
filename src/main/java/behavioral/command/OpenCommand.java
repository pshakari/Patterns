package main.java.behavioral.command;

public class OpenCommand implements ICommand {
    private Door door;

    public OpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
