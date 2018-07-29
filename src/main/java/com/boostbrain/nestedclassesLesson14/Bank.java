package com.boostbrain.nestedclassesLesson14;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Bank {

    public class Account{
        private String id;
        private String name;
        private int moneySum;
        private ArrayList<AccountOperation> operations = new ArrayList<>();

        public Account(String id, String name, int moneySum){
            this.id = id;
            this. name = name;
            this.moneySum = moneySum;
        }

        public void open(){
            accounts.put(id, this);
        }

        public void register(){

        }

        public void close(){
            accounts.remove(id);
        }
    }

    public static class Banker{
        public Bank createBank() {
            return new Bank();
        }
    }

    private Bank(){

    }

   private HashMap<String,Account> accounts = new HashMap<String, Account>();

    public void putMoney(String  id, int amount){
       Account account = accounts.get(id);
       if(account == null){
           return;
       }
       AccountOperation operation = new AccountOperation(){     // begin of declaring of anonymous class

           @Override
           public Date getDate() {
               return new Date();
           }

           @Override
           public int amount() {
               return amount;
           }
       };                   // end of operator of declaring of anonymous class
        account.operations.add(operation);
    }

    public void getMoney(String id, int amount){
        Account account = accounts.get(id);
        if(account == null){
            return;
        }

        AccountOperation accountOperation = new AccountOperation() {
            @Override
            public Date getDate() {
                return new Date();
            }

            @Override
            public int amount() {
                return -amount;
            }
        };
        account.operations.add(accountOperation);
    }
}
