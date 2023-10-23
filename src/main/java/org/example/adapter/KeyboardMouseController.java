package org.example.adapter;

public class KeyboardMouseController implements IKeyboardMouseController{
    Game game;

    public KeyboardMouseController(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void pressKeyW() {
        game.moveForward();
    }

    @Override
    public void pressKeyA() {
        game.moveLeft();
    }

    @Override
    public void pressKeyS() {
        game.moveBack();
    }

    @Override
    public void pressKeyD() {
        game.moveRight();
    }

    @Override
    public void mouseClickLeft() {
        game.punch();
    }

    @Override
    public void mouseClickRight() {
        game.kick();
    }


}
