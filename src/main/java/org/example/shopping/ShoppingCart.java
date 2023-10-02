package org.example.shopping;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    PaymentProcessor processor = new PaymentProcessor();
    Scanner scanner = new Scanner(System.in);

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int quantity) {
        Product p = new Product(name, price, quantity);
        products.add(p);
    }

    public void removeProduct(String name) {
        products.removeIf(p -> p.getName().equals(name));
    }

    public double getTotalPrice() {
        double total = 0;
        for(Product p: products) {
            total += p.getPrice() * p.getQuantity();
        }
        return total;
    }

    public void choosePayment(IPaymentStrategy strategy) {
        processor.setPaymentStrategy(strategy);
    }

    public void confirmOrder() {
        processor.strategyExecute(getTotalPrice());
    }

}
