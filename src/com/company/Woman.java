package com.company;

public class Woman extends Human {

    private Man husband;

    public Woman(String name, int age) {
        super(name, age);
    }

    public Man getHusband() {
        return husband;
    }

    public void setHusband(Man husband) {
        this.husband = husband;
    }


}
