package com.refactor.bootcamp.middle_man.example_3;

public class Engineer {
    private String name;
    private int age;

    public Engineer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public double getBillableAmount() {
        double base = 100 * 0.7;
        double tax = base * 0.1;
        return base + tax;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return name.substring(name.lastIndexOf(' ') + 1);
    }

    public int getAge() {
        return age;
    }
}
