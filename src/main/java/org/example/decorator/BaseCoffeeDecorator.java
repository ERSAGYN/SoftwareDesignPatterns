package org.example.decorator;

public class BaseCoffeeDecorator implements ICoffee {
    ICoffee wrappee;
    String description;

    public BaseCoffeeDecorator(ICoffee wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription();
    }

    @Override
    public double cost() {
        return wrappee.cost();
    }
}
