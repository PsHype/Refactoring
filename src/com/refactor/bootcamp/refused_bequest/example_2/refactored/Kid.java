package com.refactor.bootcamp.refused_bequest.example_2.refactored;

public class Kid {

    private Human human;

    public Kid(String name) {
        this.human = new Human(name);
    }

    public String getName() {
        return human.getName();
    }
}
