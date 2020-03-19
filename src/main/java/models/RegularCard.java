package models;


public class RegularCard extends Card {

    private static final double MINIMUM_CREDIT = 0;

    public RegularCard(double credit) {
        super(credit);
    }

    public boolean pay(int amount) {
        if (this.getCredit() - amount < MINIMUM_CREDIT) return false;
        else {
            this.setCredit(this.getCredit() - amount);
        }
        return true;
    }
}
