package com.refactor.bootcamp.data_clumps.example_2.refactored;

public class Address {
    private final String city;
    private final String address;
    private final String street;

    public Address(String city, String address, String street) {
        this.city = city;
        this.address = address;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getStreet() {
        return street;
    }
}
