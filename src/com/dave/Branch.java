package com.dave;

import java.util.ArrayList;

public class Branch {
    // private variables
    private String name;
    private ArrayList<Customer>customers;

    // overloading constructor
    public Branch (String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {   // This getter will return the list of customer for that particular branch
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
         Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {

            //Customer cst = new Customer();
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }


    private Customer findCustomer(String customerName) {
        for (int index = 0; index < customers.size(); index++) {
            if (this.customers.get(index).getName().equalsIgnoreCase(customerName)) {
                return this.customers.get(index);
            }

        }
        return null;
    }


}