package main.java.behavioral.command;

//Invoker
public class Remote {
    private ICommand openCommand;
    private ICommand closeCommand;

    public Remote(ICommand openCommand, ICommand closeCommand) {
        this.openCommand = openCommand;
        this.closeCommand = closeCommand;
    }

    public void clickOpen(){
        openCommand.execute();
    }

    public void clickClose() {
        closeCommand.execute();
    }
}
