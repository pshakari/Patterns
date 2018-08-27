package main.java.behavioral.cor;

public class Parser {
    private Parser successor;

    public void parse(String filename) {
        if(successor != null) {
            successor.parse(filename);
        } else {
            System.out.println("Unable to find correct parser!");
        }
    }

    protected boolean canHandleFormat(String filename, String format){
        return filename == null || filename.endsWith(format);
    }

    public Parser getSuccessor() {
        return successor;
    }

    public void setSuccessor(Parser successor) {
        this.successor = successor;
    }
}
