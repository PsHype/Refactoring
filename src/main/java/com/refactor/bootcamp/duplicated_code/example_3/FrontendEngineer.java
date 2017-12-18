package com.refactor.bootcamp.duplicated_code.example_3;

class FrontendEngineer extends Engineer {

    public FrontendEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Frontend";
    }

    public double getBillableAmount() {
        double base = unit * 0.8;
        double tax = base * 0.1;
        return base + tax;
    }
}
