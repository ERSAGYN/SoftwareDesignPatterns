package org.example.decorator;

public class SugarCoffeeDecorator extends BaseCoffeeDecorator {
    public SugarCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);

    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n\t + with sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 500;
    }
}
