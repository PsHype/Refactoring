package com.refactor.bootcamp.data_clumps.example_2.refactored;

public class OrderInfo {
    private final Address address;
    private final PersonInfo personInfo;
    private final String orderName;
    private final double payAmount;

    public OrderInfo(Address address, PersonInfo personInfo, String orderName, double payAmount) {
        this.address = address;
        this.personInfo = personInfo;
        this.orderName = orderName;
        this.payAmount = payAmount;
    }

    public Address getAddress() {
        return address;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public String getOrderName() {
        return orderName;
    }

    public double getPayAmount() {
        return payAmount;
    }
}
