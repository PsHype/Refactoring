package duplicated_code.example_1;

import java.util.Map;

public class DuplicatedCodeExample1 {

    public static final String COMPUTER_ENGINEER = "Computer";
    public static final String CIVIL_ENGINEER = "Civil";
    private final Map<String, String> engineerList;

    public DuplicatedCodeExample1(Map<String, String> engineerList) {
        this.engineerList = engineerList;
    }

    public String findComputerEngineer() {
        String computerEngineer = COMPUTER_ENGINEER;

        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(computerEngineer)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(computerEngineer);
    }

    public String findCivilEngineer() {
        String civilEngineer = CIVIL_ENGINEER;
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(civilEngineer)) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(civilEngineer);
    }
}
