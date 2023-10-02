package org.example;

import org.example.shopping.PaymentProcessor;
import org.example.shopping.ShoppingCart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        ShoppingCart cart = new ShoppingCart();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Выберите действие: \n1. add \n2.remove\n3.total\n4.payment\n5.confirm\n6.Exit");
            switch (scanner.nextInt()) {
                case 1:
                    cart.addProduct();
                    break;
                case 2:
                    cart.removeProduct();
                    break;
                case 3:
                    System.out.println(cart.getTotalPrice());
                    break;
                case 4:
                    cart.choosePayment();
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