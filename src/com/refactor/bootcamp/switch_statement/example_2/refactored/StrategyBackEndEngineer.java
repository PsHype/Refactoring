package com.refactor.bootcamp.switch_statement.example_2.refactored;

public class StrategyBackEndEngineer extends StrategyEngineer {

    @Override
    public double getBillableAmount(double unit) {
        double base = unit * 0.8;
        double tax = base * 0.1;
        return base + tax;
    }
}
