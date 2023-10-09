package org.example.shopping;

public class QRPaymentStrategy implements IPaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Successfully paid with QR " + amount);
    }
}
