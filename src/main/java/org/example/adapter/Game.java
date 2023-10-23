package org.example.adapter;

public class Game implements IGameControls{
    int positionZ = 0;
    int positionX = 0;

    int enemyPositionZ = 1;
    int enemyPositionX = 0;
    int enemyHP = 100;

    IKeyboardMouseController keyboardMouseController;

    public IKeyboardMouseController getController() {
        return keyboardMouseController;
    }

    public void setController(IKeyboardMouseController keyboardMouseController) {
        this.keyboardMouseController = keyboardMouseController;
    }

    @Override
    public void moveForward() {
        positionZ += 1;
        printOut();
    }

    @Override
    public void moveBack() {
        positionZ -= 1;
        printOut();
    }

    @Override
    public void moveRight() {
        positionX += 1;
        printOut();
    }

    @Override
    public void moveLeft() {
        positionX -= 1;
        printOut();
    }

    @Override
    public void punch() {
        if(isEnemyAround()) {
            enemyHP -= 10;
        } else {
            System.out.println("Miss!");
        }
        printOut();
    }

    @Override
    public void kick() {
        if(isEnemyAround()) {
            enemyHP -= 20;
        } else {
            System.out.println("Miss!");
        }
        printOut();
    }

    public boolean isEnemyAround() {
        return Math.abs(positionX - enemyPositionX) <= 1 && Math.abs(positionZ - enemyPositionZ) <= 1;
    }

    void printOut() {
        System.out.println("Your position X: " + positionX + "\nYourPosition Z: " + positionZ + "\nEnemy position X: " +
                enemyPositionX + "\nEnemy position Z: " + enemyPositionZ + "\nEnemy HP: " + enemyHP);
    }
}
