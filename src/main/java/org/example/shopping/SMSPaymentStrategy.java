package org.example.shopping;

import java.util.Scanner;

public class SMSPaymentStrategy implements IPaymentStrategy{
    int smsCode = (int)(Math.random() * 9000) + 1000;

    public void sendSMS() {
        System.out.println("Your sms code is: " + smsCode);
    }
    @Override
    public void processPayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        sendSMS();
        if(scanner.nextInt() == smsCode) {
            System.out.println("Successfully paid by SMS " + amount);
        } else {
            System.out.println("Wrong SMS");
        }
    }
}
