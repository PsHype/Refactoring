package com.refactor.bootcamp.duplicated_code.example_2;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

public class ComputerEngineer extends Engineer {
    public ComputerEngineer(Map<String, String> engineerList) {
        super(engineerList);
    }

    @Override
    public String getType() {
        return "Computer";
    }

    String find() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(getType())) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(getType());
    }
}
