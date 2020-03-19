package models;


public abstract class Card {
    private double credit; //(double)

    public Card(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public abstract boolean pay(int amount);
}
