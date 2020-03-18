package models;

import com.sun.deploy.security.SelectableSecurityManager;


public class GoldCard extends Card implements Payment {
    
    private int discount;
    private double hello;

    public GoldCard(int cardId, String name,  double credit, int discount) throws IllegalArgumentException {
        super(cardId, name, credit);
    }

    public GoldCard(int cardId, String name, String address, String city, double credit, int discount) throws IllegalArgumentException {
        super(cardId, name, address, city, credit);
        if(discount>0 && discount <= 30 ){
            this.discount = discount;
        } else{
            throw new IllegalArgumentException("discount not in range of greater then 0 and 30");
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) throws IllegalArgumentException {
        if(discount>0 && discount <= 30 ){
            this.discount = discount;
        } else{
            throw new IllegalArgumentException("discount not in range of greater then 0 and 30");
        }
    }

    public boolean pay(int amount) {
        System.out.println(this.getCredit() - ((amount / 100.00) * (100.00 - discount)));
        if(this.getCredit() - ((amount * discount) / 100.00) < 0.00) return false;
        else{
            this.setCredit(this.getCredit() - amount);
        }
        return true;
    }
}
