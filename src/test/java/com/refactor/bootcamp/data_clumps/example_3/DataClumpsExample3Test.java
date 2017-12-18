package com.refactor.bootcamp.data_clumps.example_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class DataClumpsExample3Test {
    @Test
    public void should_place_order_success() throws Exception {
        DataClumpsExample3 clump = new DataClumpsExample3();
        Address address = new Address("Zhuhai","QingLv","art street");
        PersonInfo info = new PersonInfo("156522","shshao");
        clump.placeOrder(address.getCity(), address.getAddress(), info.getPhoneNo(), info.getName());

        assertEquals("Zhuhai", clump.getCity());
        assertEquals("QingLv", clump.getAddress());
        assertEquals("156522", clump.getPhoneNo());
        assertEquals("shshao", clump.getName());



    }
}