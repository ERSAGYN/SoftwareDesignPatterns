package org.example.observer;

public class AirBender extends Character {
    public AirBender(String name) {
        super(name, "Air nation", "air", 100);
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("storm")) bendPower *= 10;
        printOut();
    }
}
