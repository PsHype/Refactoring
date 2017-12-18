package com.refactor.bootcamp.parallel_inheritance_hierarchies;

public class FrontendEngineer implements Engineer {
    @Override
    public String getType() {
        return "Frontend";
    }

    @Override
    public MileStone getMileStone() {
        return new FrontendStone();
    }
}
