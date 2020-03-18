package models;


public class RegularCard extends Card implements Payment {

    public RegularCard(int cardId, String name, double credit) {
        super(cardId, name, credit);
    }

    public RegularCard(int cardId, String name, String address, String city, double credit) {
        super(cardId, name, address, city, credit);
    }

    public boolean pay(int amount) {
        if(this.getCredit() - amount < 0.0) return false;
        else{
            this.setCredit(this.getCredit() - amount);
        }
        return true;
    }
}
