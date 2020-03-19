package base;

import models.GoldCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        GoldCard card = new GoldCard(1,2000.00, 20);
        card.pay(1000);
        System.out.println(card.getCredit());

    }
}
