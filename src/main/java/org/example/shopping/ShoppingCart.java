package org.example.shopping;

import java.util.ArrayList;

public class ShoppingCart {
    PaymentProcessor processor = new PaymentProcessor();

    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(String name, double price, int quantity) {
        Product p = new Product(name, price, quantity);
        products.add(p);
    }

//    public void addProduct() {
//        Product p = new Product();
//        System.out.println("Enter name");
//        p.setName(scanner.next());
//        System.out.println("Enter price");
//        p.setPrice(scanner.nextInt());
//        System.out.println("Enter quantity");
//        p.setQuantity(scanner.nextInt());
//    }

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
