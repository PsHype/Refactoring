package com.refactor.bootcamp.middle_man.example_2;

public class MiddleManExample2 {

    public static final int LEVEL_2 = 2;
    public static final int LEVEL_1 = 1;
    private int numberOfLateDeliveries;

    public MiddleManExample2(int numberOfLateDeliveries) {
        this.numberOfLateDeliveries = numberOfLateDeliveries;
    }

    public int getRating() {
        return (moreThanFiveLateDeliveries()) ? LEVEL_2 : LEVEL_1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }

}
