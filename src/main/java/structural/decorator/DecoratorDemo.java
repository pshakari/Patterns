package main.java.structural.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.drive();
        Car luxuryCar = new LuxuryCar(sportsCar);
        luxuryCar.drive();
    }
}
