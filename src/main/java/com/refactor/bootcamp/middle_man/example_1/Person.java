package com.refactor.bootcamp.middle_man.example_1;

public class Person {
    private Department department;
    private String name;

    public Person(Department department, String name) {
        this.department = department;
        this.name = name;
    }

    public String getDepartmentName() {
        return department.getName();
    }

    public String getGroup() {
        return department.getGroup();
    }

    public String getRegion() {
        return department.getRegion();
    }

    public String getCity() {
        return department.getCity();
    }

    public String getName() {
        return name;
    }
}
