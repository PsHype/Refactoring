package com.refactor.bootcamp.large_class.example_1;

public class LargeClassExample1 {

    private String phoneNo;
    private String areaCode;
    private String address;
    private String street;
    private String city;
    private String personName;
    private int age;


    public LargeClassExample1(String phoneNo, String areaCode, String address, String street, String city, String personName, int age) {
        this.phoneNo = phoneNo;
        this.areaCode = areaCode;
        this.address = address;
        this.street = street;
        this.city = city;
        this.personName = personName;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return areaCode + "-" + phoneNo;
    }

    public String formatUserInfo() {
        return "name: " + personName + " age: " + age;
    }

    public String formatAddress() {
        return "city: " + city + " street: " + street + " address: " + address;
    }
}
