package org.example.observer;

public abstract class Character implements CharacterObserver{
    public String name;
    public String nation;
    public String bendingAbility;
    public int bendPower;

    public Character(String name, String nation, String bendingAbility, int bendPower) {
        this.name = name;
        this.nation = nation;
        this.bendingAbility = bendingAbility;
        this.bendPower = bendPower;
        printOut();
        Event.addObserver(this);
    }

    void printOut() {
        System.out.println("Name: " + name + ", nation: " + nation + ", bending ability: " + bendingAbility + ", bend power: " + bendPower + "\n");
    }
}
