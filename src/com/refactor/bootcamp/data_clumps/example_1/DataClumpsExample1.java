package com.refactor.bootcamp.data_clumps.example_1;

public class DataClumpsExample1 {
    private String address;
    private String city;
    private String street;
    private String phoneNo;
    private String areaCode;
    private String name;
    private int age;

    public DataClumpsExample1(String address, String city, String street, String phoneNo, String areaCode, String name, int age) {
        this.address = address;
        this.city = city;
        this.street = street;
        this.phoneNo = phoneNo;
        this.areaCode = areaCode;
        this.name = name;
        this.age = age;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMobilePhoneNumber() {
        return getAreaCode() + "-" + getPhoneNo();
    }

    public String getDetailAddress() {
        return city + "-" + street + "-" + address;
    }
}
