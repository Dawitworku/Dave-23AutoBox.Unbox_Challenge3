package com.dave;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank("Bank of America ");


        bank.addBranch("Baily's Cross Road");

        bank.addCustomer("Baily's Cross Road","Dawit Chekol",300.00);
        bank.addCustomer("Baily's Cross Road","Mike Payne ",300.00);
        bank.addCustomer("Baily's Cross Road","Robert Dicks",300.00);

        bank.addBranch("Springfield");

        bank.addCustomer("Springfield", "Dawit Chekol",300.00);

        bank.addCustomerTransaction("Baily's Cross Road","Dawit Chekol",44.22);
        bank.addCustomerTransaction("Baily's Cross Road","Mike Payne",54.20);
        bank.addCustomerTransaction("Baily's Cross Road","Robert Dicks",12.50);

        bank.listCustomers("Baily's Cross Road",true);
        bank.listCustomers("Springfield",true);






    }
}
