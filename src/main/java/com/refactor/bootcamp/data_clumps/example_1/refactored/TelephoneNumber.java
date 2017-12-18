package com.refactor.bootcamp.data_clumps.example_1.refactored;

public class TelephoneNumber {
    private final String phoneNo;
    private final String areaCode;

    public TelephoneNumber(String phoneNo, String areaCode) {
        this.phoneNo = phoneNo;
        this.areaCode = areaCode;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getPhoneNumber() {
        return getAreaCode() + "-" + getPhoneNo();
    }
}
