package com.refactor.bootcamp.duplicated_code.example_5;

public class Person {

    private final String name;
    private final String officeAreaCode;
    private final String officeNumber;

    public Person(String name, String officeAreaCode, String officeNumber) {
        this.name = name;
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getOfficeTelephoneNumber() {
        return "(" + officeAreaCode + ") " + officeNumber;
    }

    public String getName() {
        return name;
    }
}
