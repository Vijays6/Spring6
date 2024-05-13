package com.vj;

public class Laptop {
    private String brand;
    private Ssd ssd;


    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    public Laptop() {
        System.out.println("Obj Created");
    }

    public Laptop(String warranty) {
        System.out.println("Arg Constructor");
        System.out.println(warranty);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("Setter Called");
        this.brand = brand;
    }
}