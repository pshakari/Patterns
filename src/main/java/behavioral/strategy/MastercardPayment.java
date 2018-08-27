package main.java.behavioral.strategy;

public class MastercardPayment implements PaymentProcessor {
    @Override
    public void execute(int amount) {
        System.out.println("Pay with mastercard, amount: "+amount);
    }
}
