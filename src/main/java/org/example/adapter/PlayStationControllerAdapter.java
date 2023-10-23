package org.example.adapter;

public class PlayStationControllerAdapter extends KeyboardMouseController implements IPlayStationController{
    KeyboardMouseController controller;

    public PlayStationControllerAdapter(KeyboardMouseController controller) {
        super(controller.getGame());
        this.controller = controller;
    }

    public void pressButtonTriangle() {
        controller.pressKeyW();
    }

    public void pressButtonSquare() {
        controller.pressKeyA();
    }

    public void pressButtonCircle() {
        controller.pressKeyD();
    }

    public void pressButtonX() {
        controller.pressKeyS();
    }

    public void pressLeftButton() {
        controller.mouseClickLeft();
    }

    public void pressRightButton() {
        controller.mouseClickRight();
    }
}
