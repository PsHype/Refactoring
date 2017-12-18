package com.refactor.bootcamp.switch_statement.example_2;

import com.refactor.bootcamp.EngineerNotFoundException;

public final class Engineer {
    public static final String FULL_STACK = "FullStack";
    public static final String FRONTEND = "Frontend";
    public static final String BACKEND = "Backend";
    private String type;

    public Engineer() {
        type = FRONTEND;
    }

    double getBillableAmount(double unit) {
        if (BACKEND.equals(type)) {
            double base = unit * 0.8;
            double tax = base * 0.1;
            return base + tax;
        } else if (FRONTEND.equals(type)) {
            double base = unit * 0.7;
            double tax = base * 0.1;
            return base + tax;
        } else if (FULL_STACK.equals(type)) {
            double base = unit * 0.6;
            double tax = base * 0.1;
            return base + tax;
        } else {
            throw new EngineerNotFoundException(type);
        }
    }

    public void toFullStack() {
        type = FULL_STACK;
    }

    public void toFrontend() {
        type = FRONTEND;
    }

    public void toBackEnd() {
        type = BACKEND;
    }
}
