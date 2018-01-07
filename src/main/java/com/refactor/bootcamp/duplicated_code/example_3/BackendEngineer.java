package com.refactor.bootcamp.duplicated_code.example_3;

public class BackendEngineer extends Engineer {

    public static final double TAX_RATE = 0.2;

    public BackendEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Backend";
    }


    public double getBillableAmount() {
        double base = unit;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
