package com.refactor.bootcamp.switch_statement.example_1;

import com.refactor.bootcamp.EngineerNotFoundException;

class SwitchStatementExample1 {

    static final String COMPUTER_ENGINEER = "Computer";
    static final String CIVIL_ENGINEER = "Civil";
    static final String GENERATE_ENGINEER = "Generate";
    private final double unit;

    SwitchStatementExample1(double unit) {
        this.unit = unit;
    }

    double getBillableAmount(String type) {
        if ("Computer".equals(type)) {
            double base = unit * 0.8;
            double tax = base * 0.1;
            return base + tax;
        } else if ("Civil".equals(type)) {
            double base = unit * 0.7;
            double tax = base * 0.1;
            return base + tax;
        } else if ("Generate".equals(type)) {
            double base = unit * 0.6;
            double tax = base * 0.1;
            return base + tax;
        } else {
            throw new EngineerNotFoundException(type);
        }
    }

}
