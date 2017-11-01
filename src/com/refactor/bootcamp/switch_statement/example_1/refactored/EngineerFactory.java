package com.refactor.bootcamp.switch_statement.example_1.refactored;

import com.refactor.bootcamp.EngineerNotFoundException;

public class EngineerFactory {
    public static final String BACKEND_ENGINEER = "Backend";
    public static final String FRONTEND_ENGINEER = "Frontend";
    public static final String FULLSTACK_ENGINEER = "FullStack";

    public static Engineer create(String type, double unit) {
        if (BACKEND_ENGINEER.equals(type)) {
            return new BackendEngineer(unit);
        }
        if (FRONTEND_ENGINEER.equals(type)) {
            return new FrontendEngineer(unit);
        }
        if (FULLSTACK_ENGINEER.equals(type)) {
            return new FullStackEngineer(unit);
        }
        throw new EngineerNotFoundException(type);
    }
}