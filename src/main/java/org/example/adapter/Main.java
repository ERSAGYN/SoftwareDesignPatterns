package org.example.adapter;


public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        KeyboardMouseController keyboardMouseController = new KeyboardMouseController(game);
        XboxControllerAdapter xboxController = new XboxControllerAdapter(keyboardMouseController);
        game.setController(xboxController);
        xboxController.pressButtonB();
        xboxController.pressLeftButton();

    }
}
