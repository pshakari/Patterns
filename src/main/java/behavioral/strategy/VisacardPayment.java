package main.java.behavioral.strategy;

public class VisacardPayment implements PaymentProcessor {
    @Override
    public void execute(int amount) {
        System.out.println("Pay with visacard, amount: "+amount);
    }
}
