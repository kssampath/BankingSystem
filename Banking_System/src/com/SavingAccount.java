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
class SavingAccount extends Account{
    SavingAccount(int accountId,int customerId,double balance)
    {
        super(accountId,customerId,balance);
    }
    @Override
    public double deposit(double amount){
        double bal = amount+getBalance();
        setBalance(bal);
        return bal;
    }
    public double withDraw(double amount)
    {
        double bal=getBalance()-amount;
        setBalance(bal);
        return bal;
    }
}

