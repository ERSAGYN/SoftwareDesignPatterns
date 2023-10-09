package org.example.decorator;

import org.example.shopping.IPaymentStrategy;
import org.example.shopping.PaymentProcessor;

import java.util.ArrayList;

public class Order {
    PaymentProcessor processor = new PaymentProcessor();
    ArrayList<ICoffee> coffees = new ArrayList<>();

    public void add(ICoffee coffee) {
        coffees.add(coffee);
    }

    public void remove(int index) {
        coffees.remove(coffees.get(index - 1));
    }

    public double getTotalPrice() {
        double price = 0;
        for (ICoffee coffee: coffees) {
            price += coffee.cost();
        }
        return price;
    }

    public void printOut() {
        if(!coffees.isEmpty()) {
            for (ICoffee coffee: coffees) {
                System.out.println(coffees.indexOf(coffee) + 1 + ". " + coffee.getDescription());
            }
            System.out.println("Total price: " + getTotalPrice() + "\n");
        }
    }

    public void choosePayment(IPaymentStrategy strategy) {
        processor.setPaymentStrategy(strategy);
    }

    public void confirmOrder() {
        processor.strategyExecute(getTotalPrice());
    }
}
