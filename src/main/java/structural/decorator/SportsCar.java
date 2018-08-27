package main.java.structural.decorator;

public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("New features for Sportscar.. ");
    }

}
