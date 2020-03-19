package database;

import models.Card;
import models.Customer;
import models.GoldCard;
import models.RegularCard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class FakeDB {


    private static ArrayList<Customer> customerList = new ArrayList<>();

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public Boolean addCustomer(Customer customer) {
        try {
            customerList.add(customer);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Boolean removeCustomer(int id) {
        try {
            Iterator itr = customerList.iterator();
            while (itr.hasNext()) {
                Customer customer = (Customer) itr.next();
                if (customer.getId() == id) {
                    itr.remove();
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    public Boolean updateCustomer(Customer customer) {
        try {
            for (Customer indexCustomer : customerList) {
                if (indexCustomer.getId() == customer.getId()) {
                    indexCustomer = customer;
                    return true;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return false;
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
