package org.example.observer;

import java.util.ArrayList;

public class Event {
    private static ArrayList<CharacterObserver> observers = new ArrayList<>();

    public static void addObserver(CharacterObserver observer) {
        observers.add(observer);
    }

    public static void removeObserver(CharacterObserver observer) {
        observers.remove(observer);
    }

    public static void makeEvent(String eventName) {
        for(CharacterObserver observer: observers) {
            observer.onEvent(eventName);
        }
    }
}
