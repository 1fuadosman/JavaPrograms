package com.OOPS6.Classes58to61.Challange;

public class Account {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNUmber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNUmber(int customerPhoneNUmber) {
        this.customerPhoneNUmber = customerPhoneNUmber;
    }

    public int getAccountNumber() {

        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCustomerPhoneNUmber() {
        return customerPhoneNUmber;
    }

    public void deposit(int deposit) {
        if(deposit>0) {
            this.balance = this.balance + deposit;
            System.out.println("You have deposited £" + deposit + ". Your new balance is £" + this.balance + ".");
        } else {
            System.out.println("You have to deposit a value greater than £0");
        }
    }
3
    public  void withdrawal(int withraw) {
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
