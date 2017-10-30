package com.refactor.bootcamp.duplicated_code.example_1;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

class DuplicatedCodeExample1 {

    private static final String COMPUTER_ENGINEER = "Computer";
    private static final String CIVIL_ENGINEER = "Civil";
    private final Map<String, String> engineerList;

    DuplicatedCodeExample1(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    String findComputerEngineer() {

        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(COMPUTER_ENGINEER)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(COMPUTER_ENGINEER);
    }

    String findCivilEngineer() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(CIVIL_ENGINEER)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(CIVIL_ENGINEER);
    }
}
