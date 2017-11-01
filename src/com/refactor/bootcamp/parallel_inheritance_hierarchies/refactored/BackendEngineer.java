package com.refactor.bootcamp.parallel_inheritance_hierarchies.refactored;

public class BackendEngineer implements Engineer {

    @Override
    public String getType() {
        return "Backend";
    }

    @Override
    public String target() {
        return "backend_milestone";
    }

}


