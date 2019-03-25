package com.OOPS6.Constructors61to62;

public class Main {

    public static void main(String args[]) {
        Account account = new Account(239234, 0,"Fuad Osman","1fuadosman@gmail.com", 20120101);
        Account fuadsAccount = new Account("fuad osman", "1fuadosman@gmail.com", 020120212);
        System.out.println( fuadsAccount.getAccountNumber()); // calling the default Account


    }
}
