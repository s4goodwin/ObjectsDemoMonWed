package com.practice;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String customerName, int taxID){
        customerID = taxID;
        name = customerName;  //name = name assigns parameter and instance variable the same name, cant have that
        accounts = new ArrayList<BankAccount>();
    }

    public boolean openAccount(double initialBalance){
        var newAccount = new BankAccount();
        newAccount.deposit(initialBalance);
        var didSucceed = accounts.add(newAccount);
        return didSucceed;
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return customerID;
    }
}
