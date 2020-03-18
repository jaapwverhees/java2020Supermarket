package models;


public class Card {
    private int cardId; //(int, readonly)
    private String name; //(String)
    private String address; //(String) (might be omiƩed)
    private String city; //(String) //(might be omiƩed)
    private double credit; //(double)

    public Card(int cardId, String name, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.credit = credit;
    }

    public Card(int cardId, String name, String address, String city, double credit) {
        this.cardId = cardId;
        this.name = name;
        this.address = address;
        this.city = city;
        this.credit = credit;
    }

    public int getCardId(){
        return cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
