package org.example.shopping;

public class PaymentProcessor {
    IPaymentStrategy paymentStrategy;


    public void setPaymentStrategy(IPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void strategyExecute(double amount) {
        paymentStrategy.processPayment(amount);
    }
}
