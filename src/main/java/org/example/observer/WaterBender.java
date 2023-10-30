package org.example.observer;

public class WaterBender extends Character {

    public WaterBender(String name) {
        super(name, "Water nation", "water", 100);
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("full moon")) bendPower *= 10;
        printOut();
    }
}
