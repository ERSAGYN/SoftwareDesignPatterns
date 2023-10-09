package org.example.decorator;

public class Coffee implements ICoffee{
    String description = "Coffee";

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 500;
    }
}
