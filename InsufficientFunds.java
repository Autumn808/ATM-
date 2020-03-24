/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author autumncapasso
 */
public class InsufficientFunds extends Exception {
    //Variables
    private double amount;
    /**
     * Creates a new instance of <code>InsufficientFunds</code> without detail
     * message.
     */
    public InsufficientFunds() {
        this.amount = amount;
    }

    double currentBalance(){
        return amount;
    }



    /**
     * Constructs an instance of <code>InsufficientFunds</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public InsufficientFunds(String msg) {
        super( "Insufficient Funds");
    }
}
