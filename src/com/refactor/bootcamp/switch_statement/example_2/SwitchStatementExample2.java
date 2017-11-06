package com.refactor.bootcamp.switch_statement.example_2;

class SwitchStatementExample2 {

    private Engineer engineer;

    public SwitchStatementExample2() {
        engineer = new Engineer();
    }

    double getFrontendBillableAmount(double unit) {
        engineer.toFrontend();
        return engineer.getBillableAmount(unit);
    }

    double getBackEndBillAmount(double unit) {
        engineer.toBackEnd();
        return engineer.getBillableAmount(unit);
    }

    double getFullStackBillAmount(double unit) {
        engineer.toFullStack();
        return engineer.getBillableAmount(unit);
    }


}
