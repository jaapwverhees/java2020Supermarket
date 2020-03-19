package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularCardTest {

    RegularCard card = new RegularCard(2000);

    @Test
    void payUnsuccessful() {
        assertFalse(card.pay(3000));
        assertEquals(card.getCredit(), 2000);
    }

    @Test
    void paySuccessful() {
        assertTrue(card.pay(1000));
        assertEquals(card.getCredit(), 1000);
    }
}