package com.refactor.bootcamp.switch_statement.example_1.refactored;

public class GenerateEngineer extends Engineer {

    public GenerateEngineer(double unit) {
        super(unit);
    }

    @Override
    String getType() {
        return EngineerFactory.GENERATE_ENGINEER;
    }

    public double getBillableAmount() {
        double base = getUnit() * 0.6;
        double tax = base * 0.1;
        return base + tax;
    }
}
