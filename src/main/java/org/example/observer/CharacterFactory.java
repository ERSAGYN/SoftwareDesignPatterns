package org.example.observer;

public class CharacterFactory {
    public static Character createCharacter(String name, String nation, String bendingAbility) {
        switch (bendingAbility.toLowerCase()) {
            case "water":
                return new WaterBender(name);
            case "earth":
                return new EarthBender(name);
            case "fire":
                return new FireBender(name);
            case "air":
                return new AirBender(name);
            default: return null;
        }
    }
}
