package com.refactor.bootcamp.switch_statement.example_1.refactored;

public class BackendEngineer extends Engineer {

    public BackendEngineer(double unit) {
        super(unit);
    }

    @Override
    String getType() {
        return EngineerFactory.BACKEND_ENGINEER;
    }

    public double getBillableAmount() {
        double base = getUnit() * 0.8;
        double tax = base * 0.1;
        return base + tax;
    }
}
