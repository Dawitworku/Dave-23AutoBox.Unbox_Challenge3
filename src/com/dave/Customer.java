package com.dave;

import java.util.ArrayList;

public class Customer {
    // Private Variables

    private String name;
    private ArrayList<Double> transactions;

    // Default constructor
    public Customer() {
        this.name = "";
    }

    // overloading constructor
    public Customer (String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);   // adds the initial aount to add that array list to our transactions
    }


    // Method to add transactions
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }


    // Getters

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
