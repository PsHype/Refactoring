package com.refactor.bootcamp.duplicated_code.example_3;

class DuplicatedCodeExample3 {

    private final BackendEngineer backendEngineer;
    private final FrontendEngineer frontendEngineer;

    DuplicatedCodeExample3(double unit) {
        backendEngineer = new BackendEngineer(unit);
        frontendEngineer = new FrontendEngineer(unit);
    }

    public double getBackendBillableAmount() {
        return backendEngineer.getBillableAmount();
    }

    public double getFrontendBillableAmount() {
        return frontendEngineer.getBillableAmount();
    }
}
