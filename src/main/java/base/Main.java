package base;

import models.GoldCard;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        GoldCard card = new GoldCard(1,"Jaap", 100.00, 10);
        System.out.println(card.pay(110));
    }
}
