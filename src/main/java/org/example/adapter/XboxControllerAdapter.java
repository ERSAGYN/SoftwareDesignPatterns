package org.example.adapter;

public class XboxControllerAdapter extends KeyboardMouseController implements IXboxController {
    KeyboardMouseController controller;

    public XboxControllerAdapter(KeyboardMouseController controller) {
        super(controller.getGame());
        this.controller = controller;
    }

    @Override
    public void pressButtonA() {
        controller.pressKeyS();
    }

    @Override
    public void pressButtonB() {
        controller.pressKeyD();
    }

    @Override
    public void pressButtonX() {
        controller.pressKeyA();
    }

    @Override
    public void pressButtonY() {
        controller.pressKeyW();
    }

    @Override
    public void pressLeftButton() {
        controller.mouseClickLeft();
    }

    @Override
    public void pressRightButton() {
        controller.mouseClickRight();
    }
}
