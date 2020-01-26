/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author sai
 */
public class Bank {
    ArrayList<Account> accList;  
    Bank()
    {     
        this.accList = new ArrayList();
        accList=null;
    }
    public boolean addAccount(Account ac)
    {
        
       Iterator itr=accList.iterator();
       while(itr.hasNext()){  
       if(((Account)itr.next()).equals(ac)==true)
       {
              return false;
       }
        }
        accList.add(ac);
        return true;
    }
    
    double deposit(int accountId,double amount)
    {
    Iterator itr=accList.iterator();
    while(itr.hasNext()){
    SavingAccount st=(SavingAccount)itr.next();
    if(st.getAccountId()==accountId)
    {
    double bal=st.getBalance()+amount;
    st.setBalance(bal);
    return bal;
    }   
    }
    return -1;}
    @SuppressWarnings("empty-statement")
    double withDraw(int accountId,double amount)
    {
    Iterator itr=accList.iterator();
    while(itr.hasNext()){
    SavingAccount st=(SavingAccount)itr.next();
    if(st.getAccountId()==accountId)
    {
        if(amount<=st.getBalance())
        {
            double bal=st.getBalance()-amount;
            st.setBalance(bal);
            return bal;
        }
        else{try{
            throw new OutOfBalanceException(st.getBalance(),amount);//throw out of balane exception
        }
        catch(OutOfBalanceException e){
             System.out.println(e.getMessage()); 
        }
    }
    } 
}
      return -1;  
    }
    public HashSet<Integer> customerSet(){
         HashSet<Integer> h = new HashSet<>(); 
          Iterator itr=accList.iterator();
           while(itr.hasNext()){
               h.add(new Integer("((SavingAccount)itr.next()).getCustomerId()"));
           }
           return h;
    }
    public HashMap<Integer,Account> acctMap(){
        HashMap<Integer,Account> map=new HashMap<>();
        Iterator itr=accList.iterator();
        HashMap accmap= new HashMap();
        while(itr.hasNext()){
         SavingAccount sa= (SavingAccount)itr.next();
         accmap.put(sa.getAccountId(),sa);
        }
        return accmap;
    }
}