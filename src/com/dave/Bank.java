package com.dave;

import java.util.ArrayList;

public class Bank {
    //private variables

    private String name;
    private ArrayList<Branch> branches;

    //overloading constructor
    public Bank (String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();  //Initialize the array list
    }


    public boolean addBranch(String branchName) {
        Branch branch = findBranch(branchName);
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,amount);
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for (int index = 0; index < branches.size(); index++) {
            if (this.branches.get(index).getName().equalsIgnoreCase(branchName)) {
                return this.branches.get(index);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);

        if (branch != null) {
            System.out.println("\nCustomer details for branch " + branch.getName() + "\n");

            // printing the list of customers
            ArrayList<Customer>branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("\nCustomer: " + branchCustomers.get(i).getName() + "[" + (i + 1) + "]");


                if (showTransactions) {
                    System.out.println("Transactions: ");


                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]" + "Amount: " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }







}
