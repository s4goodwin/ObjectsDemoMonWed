package com.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> allAccounts;
    private ArrayList<Customer> allCustomers;

    public Bank() { //no return type
        allCustomers = new ArrayList<Customer>();
        allAccounts = new ArrayList<BankAccount>();
    }

    public void doBanking() { //doesnt return anything so its void
        var inputReader = new Scanner(System.in);//system.in is the command line input
        while (true) {//creates a never ending loop
            printMenu();
            var userChoice = inputReader.nextInt();
            switch (userChoice){ //like el if in python
                case 1:                                     //ad break at the end of case statements otherwise, it just moves onto the next case
                    System.exit(0);
                case 2:
                    addCustomer(inputReader);
                    break;
                case 3:
                    System.out.println("not yet implemented");
                    break;                                   //break is added at the last case incase we add more cases later
            }
        }
    }

    private void addCustomer(Scanner inputReader) {
        inputReader.nextLine();                                  //eats the \n from previous call to nextInt
        System.out.print("enter the new customer's name: ");
        var newCustomerName = inputReader.nextLine();
        System.out.print("enter the new customer's tax id: ");
        var newCustomerTaxID = inputReader.nextInt();
        var newCustomer = new Customer(newCustomerName, newCustomerTaxID);
        allCustomers.add(newCustomer);
        System.out.println("success! created new customer with name:"+newCustomer.getName() +" and TaxId: "+newCustomer.getID());
    }

    private void printMenu() {
        System.out.println("======================================");
        System.out.println("what do u want to do next:");
        System.out.println("   [1] exit the program");
        System.out.println("   [2] add a new customer");
        System.out.println("   [3] get help");
        System.out.println("======================================");
        System.out.println("type the number of the options you want:");
    }
}
