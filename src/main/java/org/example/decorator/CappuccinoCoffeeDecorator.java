package org.example.decorator;

public class CappuccinoCoffeeDecorator extends BaseCoffeeDecorator {
    public CappuccinoCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);
        super.description = "Cappuccino";
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
