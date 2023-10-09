package org.example.decorator;

public abstract class BaseCoffeeDecorator implements ICoffee {
    ICoffee wrappee;
    String description;

    public BaseCoffeeDecorator(ICoffee wrappee) {
        this.wrappee = wrappee;
    }
}
