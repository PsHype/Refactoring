package com.refactor.bootcamp.switch_statement.example_1.refactored;

public class CivilEngineer extends Engineer {

    public CivilEngineer(double unit) {
        super(unit);
    }

    @Override
    String getType() {
        return EngineerFactory.CIVIL_ENGINEER;
    }

    @Override
    public double getBillableAmount() {
        double base = getUnit() * 0.7;
        double tax = base * 0.1;
        return base + tax;
    }
}
