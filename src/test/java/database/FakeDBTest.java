package database;

import models.Customer;
import models.RegularCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeDBTest {

    FakeDB fakeDB;
    Customer customerOne = new Customer(1, "testOne", new RegularCard(0));
    Customer customerTwo = new Customer(2, "testTwo", "test", "test", new RegularCard(0));

    @BeforeEach
    void setUp() {

    }

    @Test
    void getCustomerList() {
        fail();
    }

    @Test
    void addCustomer() {
        fail();
    }

    @Test
    void removeCustomer() {
        fail();
    }

    @Test
    void updateCustomer() {
        fail();
    }
}