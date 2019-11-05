package models;

public class Sneaker {
    private static Sneaker ourInstance = new Sneaker();

    public static Sneaker getInstance() {
        return ourInstance;
    }
    
    private int id;
    private String name;
    private String brand;
    private String sport;
    private int size;
    private int qty;
    private float price;

    private Sneaker() {
    }
}
