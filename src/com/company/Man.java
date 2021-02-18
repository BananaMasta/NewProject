package com.company;

import java.util.List;

public class Man extends Human {


    private Woman wife;

    public Man(String name, int age) {
        super(name, age);
    }


    public Woman getWife() {
        return wife;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    public Man(Woman wife) {
        this.wife = wife;
    }

}
