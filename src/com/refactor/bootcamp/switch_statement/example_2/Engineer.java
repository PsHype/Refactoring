package com.refactor.bootcamp.switch_statement.example_2;

import com.refactor.bootcamp.EngineerNotFoundException;

public final class Engineer {
    private String type;

    public Engineer(String type) {
        this.type = type;
    }

    double getBillableAmount(double unit) {
        if ("Backend".equals(type)) {
            double base = unit * 0.8;
            double tax = base * 0.1;
            return base + tax;
        } else if ("Frontend".equals(type)) {
            double base = unit * 0.7;
            double tax = base * 0.1;
            return base + tax;
        } else if ("FullStack".equals(type)) {
            double base = unit * 0.6;
            double tax = base * 0.1;
            return base + tax;
        } else {
            throw new EngineerNotFoundException(type);
        }
    }
}
