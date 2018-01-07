package com.refactor.bootcamp.duplicated_code.example_5;

public class Hotel {

    private final String name;
    private final String areaCode;
    private final String number;
    private final String street;

    public Hotel(String name, String areaCode, String number, String street) {
        this.name = name;
        this.areaCode = areaCode;
        this.number = number;
        this.street = street;
    }

    public String getTelephoneNumber() {
        return "(" + areaCode + ") " + number;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }
}
