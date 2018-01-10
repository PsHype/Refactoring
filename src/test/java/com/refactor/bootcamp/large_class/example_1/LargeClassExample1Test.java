package com.refactor.bootcamp.large_class.example_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargeClassExample1Test {

    @Test
    public void should_return_person_info() {
        LargeClassExample1 person = new LargeClassExample1("15652268268", "86", "软件园", "唐家湾110号", "珠海", "Ps天花乱坠", 18);
        assertEquals("软件园", person.getAddress());
        assertEquals("city: 珠海 street: 唐家湾110号 address: 软件园", person.formatAddress());
        assertEquals("86-15652268268", person.getPhoneNumber());
        assertEquals("name: Ps天花乱坠 age: 18", person.formatUserInfo());
    }

}