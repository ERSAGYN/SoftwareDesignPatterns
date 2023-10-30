package org.example.observer;

public class FireBender extends Character {
    public FireBender(String name) {
        super(name, "Fire nation", "fire", 100);
    }

    @Override
    public void onEvent(String eventName) {
        if(eventName.equals("solar eclipse")) bendPower = 0;
        if(eventName.equals("Sozin's comet")) bendPower *= 10;
        printOut();
    }
}
