package com.refactor.bootcamp.parallel_inheritance_hierarchies;

public class BackendEngineer implements Engineer {

    @Override
    public String getType() {
        return "Backend";
    }

    @Override
    public MileStone getMileStone() {
        return new BackendMileStone();
    }

}


