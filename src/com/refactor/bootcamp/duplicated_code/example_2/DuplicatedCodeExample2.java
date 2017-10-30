package com.refactor.bootcamp.duplicated_code.example_2;

import java.util.Map;

class DuplicatedCodeExample2 {


    private final ComputerEngineer computerEngineer;
    private final CivilEngineer civilEngineer;

    DuplicatedCodeExample2(Map<String, String> engineerList) {
        computerEngineer = new ComputerEngineer(engineerList);
        civilEngineer = new CivilEngineer(engineerList);
    }

    String findComputerEngineer() {
        return computerEngineer.find();
    }

    String findCivilEngineer() {
        return civilEngineer.find();
    }

}
