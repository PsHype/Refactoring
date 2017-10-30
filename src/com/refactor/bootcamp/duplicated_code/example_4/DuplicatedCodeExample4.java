package com.refactor.bootcamp.duplicated_code.example_4;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

class DuplicatedCodeExample4 {

    private static final String COMPUTER_ENGINEER = "Computer";
    private static final String CIVIL_ENGINEER = "Civil";
    private final Map<String, String> engineerList;

    DuplicatedCodeExample4(Map<String, String> engineerList) {
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
        String name = engineerList.get(CIVIL_ENGINEER);
        if (!"".equals(name) && name != null) {
            return name;
        }
        throw new EngineerNotFoundException(CIVIL_ENGINEER);

    }

}
