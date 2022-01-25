package com.kimeria.interoperability;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer phil = new Customer(1, "phil");
        // Customer phil = new Customer(1, null);
        System.out.println(phil);

        CustomerDatabase db = new CustomerDatabase();
        List<Customer> customers = db.getCustomers();
        try{
            db.addCustomer(phil);
        }catch(IllegalAccessException e){
            System.out.println("Caught exception");
        }

        for (Customer c : db.getCustomers()){
            System.out.println(c);
        }

        CustomerDatabase.Companion.helloWorld();


    }
}
