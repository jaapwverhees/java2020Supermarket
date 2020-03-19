package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldCardTest {
    private GoldCard card;

    @BeforeEach
    void setUp() {
        card = new GoldCard(2000.00, 20);
    }

    @Test
    void testConstructorDiscountLimitatios() {
        Throwable exception = assertThrows(Exception.class, () -> card = new GoldCard(2000.00, 50));
        Assertions.assertEquals("discount not in range of greater then 0 and 30", exception.getMessage());

        exception = assertThrows(Exception.class, () -> card = new GoldCard(2000.00, 50));
        Assertions.assertEquals("discount not in range of greater then 0 and 30", exception.getMessage());

        try {
            GoldCard cardTwo = new GoldCard(2000.00, 30);
            GoldCard cardThree = new GoldCard(2000.00, 0);
            GoldCard cardFour = new GoldCard(2000.00, 15);

            cardTwo = new GoldCard(2000.00, 30);
            cardThree = new GoldCard(2000.00, 0);
            cardFour = new GoldCard(2000.00, 15);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    void setDiscountFails() {
        Throwable exception = assertThrows(Exception.class, () -> card.setDiscount(50));
        Assertions.assertEquals("discount not in range of greater then 0 and 30", exception.getMessage());
    }

    @Test
    void setDiscountSucceeds() {
        card.setDiscount(15);
        assertEquals(15, card.getDiscount());
        card.setDiscount(0);
        assertEquals(0, card.getDiscount());
        card.setDiscount(30);
        assertEquals(30, card.getDiscount());
    }

    @Test
    void payUnsuccessful() {
        assertFalse(card.pay(3000));
        assertEquals(card.getCredit(), 2000);
    }

    @Test
    void paySuccessful() {
        assertTrue(card.pay(1000));
        assertEquals(1200, card.getCredit());
    }
}