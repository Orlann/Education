package com.boostbrain.nestedclassesLesson14;

public class NestedClassesApp {
    public static void main(String[] args) {
        Bank.Banker banker = new Bank.Banker();
        Bank bank = banker.createBank();

        Bank.Account account = bank.new Account("qwe", "Anna Orlovska", 1000);
        account.open();

        bank.putMoney("qwe",1000);

        bank.getMoney("qwe", 500);

        account.close();
    }
}
