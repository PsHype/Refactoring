package duplicated_code.example_1;

import java.util.Map;

class DuplicatedCodeExample1 {

    private static final String COMPUTER_ENGINEER = "Computer";
    private static final String CIVIL_ENGINEER = "Civil";
    private final Map<String, String> engineerList;

    DuplicatedCodeExample1(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    String findComputerEngineer() {
        String computerEngineer = COMPUTER_ENGINEER;

        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(computerEngineer)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(computerEngineer);
    }

    String findCivilEngineer() {
        String civilEngineer = CIVIL_ENGINEER;
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(civilEngineer)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(civilEngineer);
    }
}
