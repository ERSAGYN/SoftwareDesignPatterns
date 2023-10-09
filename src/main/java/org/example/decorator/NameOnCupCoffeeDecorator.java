package org.example.decorator;

public class NameOnCupCoffeeDecorator extends BaseCoffeeDecorator {
    public NameOnCupCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n\t + with name on the cup";
    }

    @Override
    public double cost() {
        return super.cost() + 500;
    }
}
