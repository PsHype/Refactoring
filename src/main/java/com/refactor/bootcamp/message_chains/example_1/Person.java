package com.refactor.bootcamp.message_chains.example_1;

public class Person {
    private Department department;
    private String name;

    public Person(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }
}
