package org.example.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Choose action: \n1. Add character\n2. Make event\n3. Exit");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Choose nation:\n1. Water nation\n2. Fire nation\n3. Earth nation\n4. Air nation");
                    Character character;
                    switch (scanner.nextInt()) {
                        case 1 -> character = CharacterFactory.createCharacter("Name", "Water nation", "water");
                        case 2 -> character = CharacterFactory.createCharacter("Name", "Fire nation", "fire");
                        case 3 -> character = CharacterFactory.createCharacter("Name", "Earth nation", "earth");
                        case 4 -> character = CharacterFactory.createCharacter("Name", "Air nation", "air");
                    }
                    break;
                case 2:
                    System.out.println("Enter name of event: ");
                    scanner.nextLine();
                    Event.makeEvent(scanner.nextLine());
                    break;
                case 3:
                    return;
            }
        }
    }
}
