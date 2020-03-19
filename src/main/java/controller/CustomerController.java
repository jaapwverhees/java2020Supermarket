package controller;

import database.FakeDB;
import models.Card;
import models.Customer;
import models.GoldCard;
import models.RegularCard;

import java.util.ArrayList;
import java.util.Random;

public class CustomerController {

    private FakeDB fakeDB;

    public boolean createNewCustomer(String name, String cardOption) {

        ArrayList<Customer> customers = fakeDB.getCustomerList();

        try {
            fakeDB.addCustomer(new Customer(generateCustomerID(customers), name, generateCard(cardOption)));
        } catch (Exception e) {
            return false;
        }
        return true;
    }


    public boolean createNewCustomer(String name, String address, String city, String cardOption) {
        ArrayList<Customer> customers = fakeDB.getCustomerList();

        if (fakeDB.addCustomer(new Customer(generateCustomerID(customers), name, address, city, generateCard(cardOption)))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeCustomer(int id) {
        if (fakeDB.removeCustomer(id)) return true;
        else return false;
    }

    public boolean updateCustomer(Customer customer) {
        if (fakeDB.updateCustomer(customer)) return true;
        else return false;
    }

    private Card generateCard(String cardOption) {
        switch (cardOption) {
            case "regular":
                return new RegularCard(0);
            case "gold":
                return new GoldCard(0, 0);
        }
        return null;
    }

    private int generateCustomerID(ArrayList<Customer> customers) {
        int id = 0;
        boolean checker = true;
        Random random = new Random();
        while (checker) {
            checker = false;
            id = random.nextInt();
            for (Customer customer : customers) {
                if (id == customer.getId()) {
                    checker = true;
                }
            }
        }
        return id;
    }

}
