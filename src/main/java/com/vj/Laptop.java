package com.vj;

public class Laptop {
    private String brand;

    public Laptop() {
        System.out.println("Obj Created");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Setter Called");
        this.brand = brand;
    }
}
