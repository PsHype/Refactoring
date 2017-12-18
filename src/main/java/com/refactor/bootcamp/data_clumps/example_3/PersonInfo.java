package com.refactor.bootcamp.data_clumps.example_3;

public class PersonInfo {
    private final String phoneNo;
    private final String name;

    public PersonInfo(String phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }
}
