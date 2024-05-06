package com.vj;

public class Laptop {
    private String brand;

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    private Ssd ssd;

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
