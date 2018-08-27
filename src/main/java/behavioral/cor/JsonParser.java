package main.java.behavioral.cor;

public class JsonParser extends Parser {
    public JsonParser(Parser successor){
        super.setSuccessor(successor);
    }

    @Override
    public void parse(String filename) {
        if(canHandleFormat(filename,".json")){
            System.out.println("JSON parser...");
        } else {
            super.parse(filename);
        }
    }
}
