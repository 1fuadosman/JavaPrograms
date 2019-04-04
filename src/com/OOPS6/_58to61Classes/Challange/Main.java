package com.OOPS6._58to61Classes.Challange;

public class Main {

    public static void main(String args[]) {
        Account account = new Account();
        System.out.println(account.getBalance());
        account.deposit(50);
        account.withdrawal(60);
        account.withdrawal(50);
        account.withdrawal(10);
        account.deposit(1);
        account.deposit(3);
        account.deposit(0);
        account.withdrawal(5);
        account.withdrawal(-4);
        account.withdrawal(4);

    }
}
