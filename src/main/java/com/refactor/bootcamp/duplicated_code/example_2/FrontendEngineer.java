package com.refactor.bootcamp.duplicated_code.example_2;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

class FrontendEngineer extends Engineer {
    public FrontendEngineer(Map<String, String> engineerList) {
        super(engineerList);
    }

    String find() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals("Frontend")) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException("Frontend");
    }

}
