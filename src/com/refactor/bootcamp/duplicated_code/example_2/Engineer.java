package com.refactor.bootcamp.duplicated_code.example_2;

import java.util.Map;

public abstract class Engineer {
    protected final Map<String, String> engineerList;

    protected Engineer(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    abstract String getType();
}
