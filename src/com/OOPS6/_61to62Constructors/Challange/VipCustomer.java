package com.OOPS6._61to62Constructors.Challange;

/*
 - It should have 3 fields name, credit limit, and email
 - Create 3 constructors
 - 1st constructor should call the constructor with 3 parameters with default values
 - 2nd constructor should pass on the 2 values it receives and add a default value  for the 3rd
 - 3rd constructor should save all fields
 - create getters only for this using code generation of intellij as setters wont be needed
 - test and confirm it wors
 */

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer() {
        this("Fuad Osman", 80,"abc@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "1fuadosman@gmail.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}
