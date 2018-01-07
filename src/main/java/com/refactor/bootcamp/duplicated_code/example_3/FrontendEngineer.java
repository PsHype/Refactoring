package com.refactor.bootcamp.duplicated_code.example_3;

class FrontendEngineer extends Engineer {

    public static final double TAX_RATE = 0.1;

    public FrontendEngineer(double unit) {
        super(unit);
    }

    @Override
    public String getType() {
        return "Frontend";
    }

    public double getBillableAmount() {
        double base = unit * 0.8;
        double tax = base * TAX_RATE;
        return base + tax;
    }
}
