package com.refactor.bootcamp.duplicated_code.example_4;

import com.refactor.bootcamp.EngineerNotFoundException;

import java.util.Map;

class DuplicatedCodeExample4 {

    private static final String BACKEND_ENGINEER = "Backend";
    private static final String FRONTEND_ENGINEER = "Frontend";
    private final Map<String, String> engineerList;

    DuplicatedCodeExample4(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    String findBackendEngineer() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(BACKEND_ENGINEER)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(BACKEND_ENGINEER);
    }

    String findFrontendEngineer() {
        String name = engineerList.get(FRONTEND_ENGINEER);
        if (!"".equals(name) && name != null) {
            return name;
        }
        throw new EngineerNotFoundException(FRONTEND_ENGINEER);

    }

}
