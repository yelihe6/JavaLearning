package org.example.chapter9_ArrayList.Test.Phone;

public class Phone {

    private int price;
    private String brand;

    public Phone() {
    }

    public Phone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
