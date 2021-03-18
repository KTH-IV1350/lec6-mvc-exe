package se.leiflindback.iv1350.mvcExe.controller;

import se.leiflindback.iv1350.mvcExe.model.Account;

/**
 * This is the application's only controller. All calls to the model pass through here.
 */
public class Controller {
    private Account acct;
    
    /**
     * Deposits the specified amount of money.
     * 
     * @param amount The amount to deposit. 
     */
    public void deposit(int amount) {
        acct.deposit(amount);
    }
}
