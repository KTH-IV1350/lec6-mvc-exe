package se.leiflindback.iv1350.mvcExe.view;

import se.leiflindback.iv1350.mvcExe.controller.Controller;

/**
 * Clicked when the user wants to deposit money to an account.
 */
public class Button {
    private Controller ctrl;
    
    public void click() {
        ctrl.deposit(1);
    }
}
