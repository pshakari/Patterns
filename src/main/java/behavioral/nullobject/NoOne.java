package main.java.behavioral.nullobject;

public class NoOne extends Employee{
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return "No one here!";
    }
}
