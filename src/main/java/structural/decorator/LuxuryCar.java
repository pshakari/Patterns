package main.java.structural.decorator;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("New features for luxury car.. ");
    }
}
