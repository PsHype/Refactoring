package com.refactor.bootcamp.duplicated_code.example_3;

public abstract class Engineer {

    protected final double unit;

    public Engineer(double unit) {
        this.unit = unit;
    }

    abstract String getType();
}
