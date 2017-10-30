package com.refactor.bootcamp.parallel_inheritance_hierarchies.refactored;

public class CivilEngineer implements Engineer {
    @Override
    public String getType() {
        return "civil";
    }

    @Override
    public String target() {
        return "civil_milestone";
    }

}
