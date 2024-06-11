package com.afernandez.main;

import com.afernandez.exceptions.InvalidProductException;

public class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) throws InvalidProductException {
        if (id < 0) throw new InvalidProductException("ID non negative.");
        if (name == null || name.isEmpty()) throw new InvalidProductException("Name non empty pls.");
        if (price < 0) throw new InvalidProductException("Price non negative x2.");

        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) throws InvalidProductException {
        if (id < 0) throw new InvalidProductException("ID non negative.");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidProductException {
        if (name == null || name.isEmpty()) throw new InvalidProductException("Name non empty pls.");
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws InvalidProductException {
        if (price < 0) throw new InvalidProductException("Price non negative x2.");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
