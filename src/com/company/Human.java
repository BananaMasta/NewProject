package com.company;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    private String sex;
    private List<Human> children = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public void addChild(Human human) {
        children.add(human);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {

    }
}
