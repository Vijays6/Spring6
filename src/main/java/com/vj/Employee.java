package com.vj;

public class Employee implements Computer{
    private int id;
    Computer com;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    @Override
    public void startUp() {
        com.startUp();
    }
}
