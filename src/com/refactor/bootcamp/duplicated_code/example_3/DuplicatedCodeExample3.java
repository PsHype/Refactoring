package com.refactor.bootcamp.duplicated_code.example_3;

class DuplicatedCodeExample3 {

    private final ComputerEngineer computerEngineer;
    private final CivilEngineer civilEngineer;

    DuplicatedCodeExample3(double unit) {
        computerEngineer = new ComputerEngineer(unit);
        civilEngineer = new CivilEngineer(unit);
    }

    public double getComputerBillableAmount() {
        return computerEngineer.getBillableAmount();
    }

    public double getCivilBillableAmount() {
        return civilEngineer.getBillableAmount();
    }
}
