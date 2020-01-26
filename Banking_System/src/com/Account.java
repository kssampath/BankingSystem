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
public abstract class Account{

    private int accountId;
    private int customerId;
    private double balance;
      
    Account(int accountId,int customerId,double balance)
    {
        this.accountId=accountId;
        this.customerId=customerId;
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public int getAccountId()
    {
        return accountId;
    }
   public void setBalance(int balance){
         this.balance=balance;
   }
   public void setCustomerId(int customerId)
   {
       this.customerId=customerId;
   }
   public void setBalance(double balance){
         this.balance=balance;
   } 
    public abstract double withDraw(double a);
    public abstract double deposit(double b);
    
}

