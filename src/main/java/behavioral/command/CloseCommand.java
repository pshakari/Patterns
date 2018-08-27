package main.java.behavioral.command;

public class CloseCommand implements ICommand {
    private Door door;

    public CloseCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.close();
    }
}
