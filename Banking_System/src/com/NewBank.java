/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author sai
 */
public class NewBank {
   private TreeSet<Account> acctSet;

    public int addAccountSet(){
        this.acctSet = new TreeSet<>(new Comparator<Account>() {

            @Override
            public int compare(Account a, Account b) {
                 
            return ((Integer)a.getAccountId()).compareTo((Integer)b.getAccountId());
            }
        });
        return acctSet.size();    
}
public TreeSet<Account> getAcctSet(){
       return acctSet;
}

}