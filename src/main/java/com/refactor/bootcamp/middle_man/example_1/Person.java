package com.refactor.bootcamp.middle_man.example_1;

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

    public String getName() {
        return name;
    }
}
