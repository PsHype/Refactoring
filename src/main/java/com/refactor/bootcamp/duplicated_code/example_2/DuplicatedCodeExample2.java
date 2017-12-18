package com.refactor.bootcamp.duplicated_code.example_2;

import java.util.Map;

class DuplicatedCodeExample2 {


    private final BackendEngineer backendEngineer;
    private final FrontendEngineer frontendEngineer;

    DuplicatedCodeExample2(Map<String, String> engineerList) {
        backendEngineer = new BackendEngineer(engineerList);
        frontendEngineer = new FrontendEngineer(engineerList);
    }

    String findBackendEngineer() {
        return backendEngineer.find();
    }

    String findFrontEngineer() {
        return frontendEngineer.find();
    }

}
