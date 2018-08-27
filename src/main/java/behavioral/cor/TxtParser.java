package main.java.behavioral.cor;

public class TxtParser extends Parser {

    @Override
    public void parse(String filename) {
        if(canHandleFormat(filename, ".txt")) {
            System.out.println("Textparser parsing...");
        } else {
            super.parse(filename);
        }
    }
}
