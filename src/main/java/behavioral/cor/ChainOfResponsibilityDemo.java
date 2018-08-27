package main.java.behavioral.cor;

import java.util.Arrays;
import java.util.List;

public class ChainOfResponsibilityDemo {

    public static void main(String [] args){

        Parser txtParser  = new TxtParser();
        Parser jsonParser = new JsonParser(txtParser);
        Parser xmlParser = new XmlParser(jsonParser);

        List<String> fileNames = Arrays.asList(".txt",".xml",".xml",".json");

        for(String filename: fileNames) {
            xmlParser.parse(filename);
        }

    }

}
