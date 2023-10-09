package org.example;

import org.example.shopping.QRPaymentStrategy;
import org.example.shopping.SMSPaymentStrategy;
import org.example.shopping.ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

//        for (int i = 0; i < 5; i++) {
//            new Thread(() -> {
//                Singleton singleton1 = Singleton.getInstance();
//                System.out.println(singleton1);
//            }).start();
//        }

        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите действие: \n1. Add product\n2. Remove product\n3. Total price of products\n4. Choose payment type\n5. Confirm order\n6. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter name of product: ");
                    String name = scanner.next();
                    System.out.println("Enter price of product: ");
                    int price = scanner.nextInt();
                    System.out.println("Enter quantity of products: ");
                    int quantity = scanner.nextInt();
                    cart.addProduct(name, price, quantity);
                    break;
                case 2:
                    System.out.println("Enter name of product you want to delete: ");
                    cart.removeProduct(scanner.next());
                    break;
                case 3:
                    System.out.println(cart.getTotalPrice());
                    break;
                case 4:
                    System.out.println("1. Payment by QR\n2. Payment by SMS");
                    switch (scanner.nextInt()) {
                        case 1 -> cart.choosePayment(new QRPaymentStrategy());
                        case 2 -> cart.choosePayment(new SMSPaymentStrategy());
                        default -> {}
                    }
                    break;
                case 5:
                    cart.confirmOrder();
                    break;
                case 6:
                    return;
            }
        }

    }
}