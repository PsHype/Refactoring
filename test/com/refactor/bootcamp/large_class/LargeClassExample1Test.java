package com.refactor.bootcamp.large_class;

import org.junit.Test;

import static org.junit.Assert.*;

public class LargeClassExample1Test {
    
    @Test
    public void should_return_person_info(){
        LargeClassExample1 person = new LargeClassExample1("ZhuHai");
        String address = person.getAddress();
        assertEquals("ZhuHai", address);
    }

}