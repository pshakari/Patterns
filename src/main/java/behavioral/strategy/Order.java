package main.java.behavioral.strategy;

public class Order {
    private PaymentProcessor paymentProcessor;
    private int amount;

    public Order(PaymentProcessor paymentProcessor, int amount) {
        this.paymentProcessor  = paymentProcessor;
        this.amount = amount;
    }

    public void process() {
        paymentProcessor.execute(amount);
    }
}
