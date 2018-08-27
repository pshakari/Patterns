package main.java.behavioral.cor;

public class XmlParser extends Parser {
    public XmlParser(Parser successor) {
        this.setSuccessor(successor);
    }

    @Override
    public void parse(String filename) {
        if(canHandleFormat(filename, ".xml")) {
            System.out.println("XML parser..");
        } else {
            super.parse(filename);
        }
    }
}
