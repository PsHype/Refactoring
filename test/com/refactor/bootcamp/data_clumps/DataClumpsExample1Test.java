package com.refactor.bootcamp.data_clumps;

import com.refactor.bootcamp.data_clumps.example_1.DataClumpsExample1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataClumpsExample1Test {
    @Test
    public void should_return_correct_data_info() {
        String address = "Art Hotel";
        String areaCode = "001";
        String city = "珠海";
        String name = "shshao";
        String phoneNo = "156522";
        String street = "情侣中路";
        int age = 17;
        DataClumpsExample1 data = new DataClumpsExample1(address, city, street, phoneNo, areaCode, name, age);
        assertEquals(address, data.getAddress());
        assertEquals(areaCode, data.getAreaCode());
        assertEquals(city, data.getCity());
        assertEquals(name, data.getName());
        assertEquals(phoneNo, data.getPhoneNo());
        assertEquals(street, data.getStreet());
        assertEquals(age, data.getAge());
        assertEquals("001-156522", data.getMobilePhoneNumber());
        assertEquals("珠海-情侣中路-Art Hotel", data.getDetailAddress());
    }

}