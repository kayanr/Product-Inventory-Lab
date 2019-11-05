package services;

import models.Sneaker;

import java.util.ArrayList;

public class SneakerService {

    private static int nextId = 1;  // (1)

    private ArrayList<Sneaker> inventory = new ArrayList<>();  // (2)

    // (1)
    public Sneaker create(String name, String brand, String sport, int size, int quantity, float price) {

        // (2)
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);

        // (3)
        inventory.add(createdSneaker);

        // (4)
        return createdSneaker;
    }

    //read
    public Sneaker findSneaker(int id) {
        // should take an int and return an object with that id, if exists
        return inventory.get(id-1);
    }

    //read all
    public Sneaker[] findAll() {
        // should return a basic array copy of the ArrayList
        Integer len = inventory.size();
        Sneaker[] sneaks = new Sneaker[len];
        for (int i = 0; i < len; i++) {
            sneaks[i] = inventory.get(i);
        }
        return sneaks;
    }

    //delete
    public Boolean delete(int id) {
        // should remove the object with this id from the ArrayList if exits and return true.
        // Otherwise return false
        Boolean outcome = false;
        if (id <= inventory.size()) {
            inventory.remove(id);
            outcome = true;
        }
        return outcome;
    }
}
