package com.refactor.bootcamp.data_clumps.example_3;

public class DataClumpsExample3 {

    private String city;
    private String address;
    private String phoneNo;
    private String name;

    public void placeOrder(String city, String address, String phoneNo, String name) {
        //wechat pay success
        //save order ok
        this.city = city;
        this.address = address;
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getName() {
        return name;
    }
}
