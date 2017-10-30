package com.refactor.bootcamp.switch_statement.example_1;

import com.refactor.bootcamp.EngineerNotFoundException;

public class SwitchStatementExample1 {

    public static final String COMPUTER_ENGINEER = "Computer";
    public static final String CIVIL_ENGINEER = "Civil";
    public static final String GENERATE_ENGINEER = "Generate";

    String findEngineerName(String type) {
        if (COMPUTER_ENGINEER.equals(type)) {

        }
        if (CIVIL_ENGINEER.equals(type)) {

        }
        if (GENERATE_ENGINEER.equals(type)) {

        }
        throw new EngineerNotFoundException(type);
    }


}
