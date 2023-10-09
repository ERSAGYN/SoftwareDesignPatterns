package org.example.decorator;

public class EspressoCoffeeDecorator extends BaseCoffeeDecorator {
    public EspressoCoffeeDecorator(ICoffee wrappee) {
        super(wrappee);
        super.description = "Espresso";
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double cost() {
        return 700;
    }
}
