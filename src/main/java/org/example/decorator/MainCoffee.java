package org.example.decorator;

import org.example.shopping.PaymentProcessor;
import org.example.shopping.QRPaymentStrategy;
import org.example.shopping.SMSPaymentStrategy;

import java.util.Scanner;

public class MainCoffee {
    static Scanner scanner = new Scanner(System.in);
    static ICoffee coffee = new Coffee();
    static PaymentProcessor processor = new PaymentProcessor();
    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Add coffee supplements\n2. Choose payment type\n3. Confirm order\n4. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    addCoffeeMenu();
                    break;
                case 2:
                    System.out.println("Choose payment type:\n1. SMS\n2. QR");
                    switch (scanner.nextInt()) {
                        case 1:
                            processor.setPaymentStrategy(new SMSPaymentStrategy());
                            break;
                        case 2:
                            processor.setPaymentStrategy(new QRPaymentStrategy());
                            break;
                    }
                    System.out.println("Payment type chosen successfully");
                    break;
                case 3:
                    processor.strategyExecute(coffee.cost());
                    break;
                case 4:
                    return;
            }
        }
    }

    public static void addCoffeeMenu() {
        System.out.println("Choose supplements:\n1. Milk\n2. Sugar\n3. Name on the cup\n4. Without supplements");
        switch (scanner.nextInt()) {
            case 1:
                coffee = new MilkCoffeeDecorator(coffee);
                System.out.println(coffee.getDescription() + "\n" + coffee.cost());
                break;
            case 2:
                coffee = new SugarCoffeeDecorator(coffee);
                System.out.println(coffee.getDescription()  + "\n" + coffee.cost());
                break;
            case 3:
                coffee = new NameOnCupCoffeeDecorator(coffee);
                System.out.println(coffee.getDescription() + "\n" + coffee.cost());
                break;
            case 4:
                break;
        }
    }
}
