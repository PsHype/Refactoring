package com.refactor.bootcamp.switch_statement.example_2.refactored;

public final class Engineer {
    StrategyEngineer engineerType;
    public Engineer() {
        engineerType = new StrategyFrontendEngineer();
    }

    double getBillableAmount(double unit) {
        return engineerType.getBillableAmount(unit);
    }

    public void toFullStack() {
        engineerType = new StrategyFullStackEngineer();
    }

    public void toFrontend() {
        engineerType = new StrategyFrontendEngineer();
    }

    public void toBackEnd() {
        engineerType = new StrategyBackEndEngineer();
    }
}
