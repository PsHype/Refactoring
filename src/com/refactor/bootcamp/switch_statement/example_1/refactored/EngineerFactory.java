package com.refactor.bootcamp.switch_statement.example_1.refactored;

import com.refactor.bootcamp.EngineerNotFoundException;

public class EngineerFactory {
    public static final String COMPUTER_ENGINEER = "Computer";
    public static final String CIVIL_ENGINEER = "Civil";
    public static final String GENERATE_ENGINEER = "Generate";

    public static Engineer create(String type, double unit) {
        if (COMPUTER_ENGINEER.equals(type)) {
            return new ComputerEngineer(unit);
        }
        if (CIVIL_ENGINEER.equals(type)) {
            return new CivilEngineer(unit);
        }
        if (GENERATE_ENGINEER.equals(type)) {
            return new GenerateEngineer(unit);
        }
        throw new EngineerNotFoundException(type);
    }
}