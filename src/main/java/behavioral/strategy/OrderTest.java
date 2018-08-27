package main.java.behavioral.strategy;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(new VisacardPayment(), 20);
        order.process();
    }
}
