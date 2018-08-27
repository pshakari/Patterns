package main.java.behavioral.nullobject;

public class Programmer extends Employee {
    public Programmer(String name) {
        this.name = name;
    }

    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
}
