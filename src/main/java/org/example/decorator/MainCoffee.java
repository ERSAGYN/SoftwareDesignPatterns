package org.example.decorator;

import org.example.shopping.QRPaymentStrategy;
import org.example.shopping.SMSPaymentStrategy;

import java.util.Scanner;

public class MainCoffee {
    static Scanner scanner = new Scanner(System.in);
    static Order order = new Order();
    public static void main(String[] args) {

        while (true) {
            order.printOut();
            System.out.println("1. Add coffee\n2. Remove coffee\n3. Choose payment type\n4. Confirm order\n5. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    addCoffeeMenu();
                    break;
                case 2:
                    order.printOut();
                    System.out.println("Choose the number of coffee you want to remove from the list above:");
                    order.remove(scanner.nextInt());
                    break;
                case 3:
                    System.out.println("1. Payment by QR\n2. Payment by SMS");
                    switch (scanner.nextInt()) {
                        case 1 -> order.choosePayment(new QRPaymentStrategy());
                        case 2 -> order.choosePayment(new SMSPaymentStrategy());
                        default -> {}
                    }
                    break;
                case 4:
                    order.confirmOrder();
                    return;
                case 5:
                    return;
            }
        }
    }

    public static void addCoffeeMenu() {
        ICoffee coffee = new Coffee();
        System.out.println("Choose coffee type:\n1. Simple coffee\n2. Espresso\n3. Latte\n4. Cappuccino");
        switch (scanner.nextInt()) {
            case 1:
                order.add(coffee);
                break;
            case 2:
                order.add(new EspressoCoffeeDecorator(coffee));
                break;
            case 3:
                order.add(new LatteCoffeeDecorator(coffee));
                break;
            case 4:
                order.add(new CappuccinoCoffeeDecorator(coffee));
                break;
        }
    }
}
