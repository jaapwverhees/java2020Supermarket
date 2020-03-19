package models;


//Has a customer a card
public class Customer {
    
    private int id;
    private String name; 
    private String address; 
    private String city;
    private Card card;

    public Customer(int id, String name, Card card) {
        this.id = id;
        this.name = name;
        this.card = card;
    }

    public Customer(int id, String name, String address, String city, Card card) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.card = card;
    }

    public int getId() {
        return id;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
