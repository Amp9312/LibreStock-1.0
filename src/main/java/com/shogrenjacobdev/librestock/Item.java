package com.shogrenjacobdev.librestock;

public class Item {
    private final int id;
    private String sku;
    private String name;
    private int quantity;
    private final int collection;

    public Item(int id, String sku, String name, int quantity, int collection) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.quantity = quantity;
        this.collection = collection;
    }

    public int getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCollection() {
        return collection;
    }
}
