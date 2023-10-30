package org.example.observer;

public class EarthBender extends Character{
    public EarthBender(String name) {
        super(name, "Earth nation", "earth", 100);
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("earthquake")) bendPower *= 10;
        printOut();
    }
}
