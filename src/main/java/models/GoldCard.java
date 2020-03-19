package models;

public class GoldCard extends Card {

    private int discount;
    private static final double MINIMUM_CREDIT = 0;

    public GoldCard(double credit, int discount) throws IllegalArgumentException {
        super(credit);
        if (discount >= 0 && discount <= 30) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("discount not in range of greater then 0 and 30");
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) throws IllegalArgumentException {
        if (discount >= 0 && discount <= 30) {
            this.discount = discount;
        } else {
            throw new IllegalArgumentException("discount not in range of greater then 0 and 30");
        }
    }

    public boolean pay(int amount) {
        if (this.getCredit() - ((amount / 100.00) * (100.00 - discount)) < MINIMUM_CREDIT) {
            return false;
        } else {
            this.setCredit(this.getCredit() - ((amount / 100.00) * (100.00 - discount)));
            return true;
        }
    }
}
