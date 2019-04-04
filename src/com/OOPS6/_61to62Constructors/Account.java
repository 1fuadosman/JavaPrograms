package com.OOPS6._61to62Constructors;

public class Account {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private double customerPhoneNumber;

    public Account(double accountNumber, double balance, String customerName, String customerEmail, double customerPhoneNumber) {
        System.out.println("Constructor with parameter called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, double customerPhoneNumber) {
        this(9999,5555, customerName,customerEmail,customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //Note the below constructor is being called by the above
    //The this, sets default parameters below if the the Account constructor has no parameters
    public  Account() {
        this(20220, 2122, "Fuad", "abc@gmail.com", 22112);
        System.out.println("Account constructor with empty parameters");
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public double getCustomerPhoneNUmber() {
        return customerPhoneNumber;
    }

    public void deposit(double deposit) {
        if(deposit>0) {
            this.balance = this.balance + deposit;
            System.out.println("You have deposited £" + deposit + ". Your new balance is £" + this.balance + ".");
        } else {
            System.out.println("You have to deposit a value greater than £0");
        }
    }

    public  void withdrawal(double withraw) {
        if(withraw<0) {
            System.out.println("Incoorect withdrawal");
        }
        else if(this.balance >=withraw) {
            this.balance = this.balance - withraw;
            System.out.println("You have withdrawn £" + withraw + ". Your new balance is £ " + this.balance);
        } else {
            System.out.println("You have an insufficient Balance. Your current balance is £" + this.balance + " and your attempting to withdraw £" + withraw + ".");
        }
    }


}
