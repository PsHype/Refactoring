package com.refactor.bootcamp.switch_statement.example_1.refactored;

public abstract class Engineer {

    protected final double unit;

    public Engineer(double unit) {
        this.unit = unit;
    }

    public double getUnit() {
        return unit;
    }


    abstract String getType();

    public abstract double getBillableAmount();
}
