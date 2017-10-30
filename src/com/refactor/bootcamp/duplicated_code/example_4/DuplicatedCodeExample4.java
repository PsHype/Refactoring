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
        return getEngineerName(COMPUTER_ENGINEER);
    }

    String findCivilEngineer() {
        return getEngineerName(CIVIL_ENGINEER);

    }

    private String getEngineerName(String civilEngineer) {
        String name = engineerList.get(civilEngineer);
        if (!"".equals(name) && name != null) {
            return name;
        }
        throw new EngineerNotFoundException(civilEngineer);
    }

}
