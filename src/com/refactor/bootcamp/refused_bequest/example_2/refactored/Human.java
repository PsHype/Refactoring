package com.refactor.bootcamp.refused_bequest.example_2.refactored;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void work() {
        System.out.println("work!!!");
    }

    public void married() {
        System.out.println("married!!!");
    }

}
