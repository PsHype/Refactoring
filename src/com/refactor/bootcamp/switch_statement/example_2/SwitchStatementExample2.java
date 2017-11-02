package com.refactor.bootcamp.switch_statement.example_2;

class SwitchStatementExample2 {
    private String type;

    public SwitchStatementExample2(String type) {
        this.type = type;
    }

    double getBillableAmount(double unit) {
        return new Engineer(type).getBillableAmount(unit);
    }

}
