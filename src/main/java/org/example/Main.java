package org.example;

import org.example.shopping.QRPaymentStrategy;
import org.example.shopping.SMSPaymentStrategy;
import org.example.shopping.ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Singleton singleton1 = Singleton.getInstance();
                System.out.println(singleton1);
            }).start();
        }

        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите действие: \n1. add \n2.remove\n3.total\n4.payment\n5.confirm\n6.Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter name");
                    String name = scanner.next();
                    System.out.println("Enter price");
                    int price = scanner.nextInt();
                    System.out.println("Enter quantity");
                    int quantity = scanner.nextInt();
                    cart.addProduct(name, price, quantity);
                    break;
                case 2:
                    System.out.println("Enter name of product you want to delete: ");
                    String removeProductName = scanner.next();
                    cart.removeProduct(removeProductName);
                    break;
                case 3:
                    System.out.println(cart.getTotalPrice());
                    break;
                case 4:
                    System.out.println("1. QR\n2.SMS");
                    switch (scanner.nextInt()) {
                        case 1:
                            cart.choosePayment(new QRPaymentStrategy());
                            break;
                        case 2:
                            cart.choosePayment(new SMSPaymentStrategy());
                            break;
                        default:
                            break;
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