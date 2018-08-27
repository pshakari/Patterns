package main.java.behavioral.observer;

public class Person implements Observer {
    private String name;

    @Override
    public void update(String availability) {
        System.out.println("Hello "+name+", Product is now "+availability+" on flipkart");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
