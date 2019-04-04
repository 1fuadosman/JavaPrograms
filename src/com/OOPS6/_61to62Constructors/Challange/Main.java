package com.OOPS6._61to62Constructors.Challange;

public class Main {

    public static void main(String args []) {
        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getEmail()); // should print the email for the constructor with three defaults

        VipCustomer vipCustomer2 = new VipCustomer("Fuad Osman", 22);
        System.out.println(vipCustomer2.getEmail()); // should print the email for the constructor with 1 default

        VipCustomer vipCustomer3 = new VipCustomer("Daud Osman", 21212, "newemail@gmail.com");
        System.out.println(vipCustomer3.getEmail()); // should print the email for the constructor no defaults or the one just declared above



    }
}
