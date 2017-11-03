package com.refactor.bootcamp.data_clumps.example_2;

public class OrderEntity {

    private final String city;
    private final String street;
    private final String address;
    private final String name;
    private final String phoneNo;
    private final String orderName;
    private final double payAmount;

    public OrderEntity(String city, String street, String address, String name, String phoneNo, String orderName, double payAmount) {
        this.city = city;
        this.street = street;
        this.address = address;
        this.name = name;
        this.phoneNo = phoneNo;
        this.orderName = orderName;
        this.payAmount = payAmount;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPayAmount() {
        return payAmount;
    }
}
