/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

/**
 *
 * @author sai
 */
public class OutOfBalanceException extends Exception{
    private double currentAmount;
    private double withDrawAmount;
    OutOfBalanceException(double currentAmount,double withDrawAmount){
        this.currentAmount=currentAmount;
        this.withDrawAmount=withDrawAmount;
    }
    @SuppressWarnings("empty-statement")
    public String getMessage(){
        double bal;
        bal = (currentAmount-withDrawAmount);
        return "The balance will go to negative on withdraw"+bal ;
    }
}
