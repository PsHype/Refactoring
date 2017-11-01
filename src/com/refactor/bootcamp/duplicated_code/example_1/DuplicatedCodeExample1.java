package com.refactor.bootcamp.duplicated_code.example_1;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

class DuplicatedCodeExample1 {

    private static final String BACKEND_ENGINEER = "Backend";
    private static final String FRONTEND_ENGINEER = "Frontend";
    private final Map<String, String> engineerList;

    DuplicatedCodeExample1(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    String findComputerEngineer() {

        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(BACKEND_ENGINEER)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(BACKEND_ENGINEER);
    }

    String findCivilEngineer() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(FRONTEND_ENGINEER)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(FRONTEND_ENGINEER);
    }
}
