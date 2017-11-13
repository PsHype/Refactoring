package com.refactor.bootcamp.switch_statement.example_2.refactored;

public final class Engineer {
    EngineerType engineerType;
    public Engineer() {
        engineerType = new FrontendEngineer();
    }

    double getBillableAmount(double unit) {
        return engineerType.getBillableAmount(unit);
    }

    public void toFullStack() {
        engineerType = new FullStackEngineer();
    }

    public void toFrontend() {
        engineerType = new FrontendEngineer();
    }

    public void toBackEnd() {
        engineerType = new BackEndEngineer();
    }
}
