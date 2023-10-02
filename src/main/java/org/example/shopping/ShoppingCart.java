package org.example.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    PaymentProcessor processor = new PaymentProcessor();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct() {
        Product p = new Product();
        System.out.println("Set name");
        p.setName(scanner.next());
        System.out.println("Set price");
        p.setPrice(scanner.nextInt());
        System.out.println("Set quantity");
        p.setQuantity(scanner.nextInt());
        products.add(p);
    }

    public void removeProduct() {
        System.out.println("Enter name");
        String name = scanner.next();
        for (Product p: products) {
            if (p.getName().equals(name)) {
                products.remove(p);
            }
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for(Product p: products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    public void choosePayment() {
        System.out.println("1. QR\n2.SMS");
        switch (scanner.nextInt()) {
            case 1:
                processor.setPaymentStrategy(new QRPaymentStrategy());
                break;
            case 2:
                processor.setPaymentStrategy(new SMSPaymentStrategy());
                break;
            default:
                choosePayment();
                break;
        }
    }

    public void confirmOrder() {
        processor.strategyExecute(getTotalPrice());
    }

}
