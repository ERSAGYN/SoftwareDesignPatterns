package org.example.decorator;

public class MilkCoffeeDecorator extends BaseCoffeeDecorator{

    public MilkCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "\n\t + with milk";
    }

    @Override
    public double cost() {
        return super.cost() + 300;
    }
}
