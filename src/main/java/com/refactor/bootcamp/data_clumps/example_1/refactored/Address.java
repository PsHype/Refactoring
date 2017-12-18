package com.refactor.bootcamp.data_clumps.example_1.refactored;

public class Address {
    private final String address;
    private final String city;
    private final String street;

    public Address(String address, String city, String street) {
        this.address = address;
        this.city = city;
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getDetailAddress() {
        return getCity() + "-" + getStreet() + "-" + getAddress();
    }
}
