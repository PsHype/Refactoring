package com.refactor.bootcamp.parallel_inheritance_hierarchies.refactored;

public class FrontendEngineer implements Engineer {
    @Override
    public String getType() {
        return "Frontend";
    }

    @Override
    public String target() {
        return "frontend_milestone";
    }

}
