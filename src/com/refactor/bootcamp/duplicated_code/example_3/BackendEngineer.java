package com.refactor.bootcamp.duplicated_code.example_3;

public class BackendEngineer extends Engineer {

    public BackendEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Backend";
    }


    public double getBillableAmount() {
        double base = unit;
        double tax = base * 0.2;
        return base + tax;
    }
}
