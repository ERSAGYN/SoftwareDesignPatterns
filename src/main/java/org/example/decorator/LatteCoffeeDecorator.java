package org.example.decorator;

public class LatteCoffeeDecorator extends BaseCoffeeDecorator{
    public LatteCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);
        super.description = "Latte";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 1000;
    }
}
