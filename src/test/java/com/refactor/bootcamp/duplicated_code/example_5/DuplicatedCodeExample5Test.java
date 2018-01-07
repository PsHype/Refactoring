package com.refactor.bootcamp.duplicated_code.example_5;

import org.junit.Assert;
import org.junit.Test;

public class DuplicatedCodeExample5Test {

    @Test
    public void should_return_right_telephone_no() {
        Person person = new Person("Ps天花乱坠", "86", "1565220000");
        Hotel hotel = new Hotel("art", "86", "139000000", "吉大");
        DuplicatedCodeExample5 example5 = new DuplicatedCodeExample5(hotel, person);

        Assert.assertEquals("(86) 139000000", example5.getHotelTelephoneNumber());
        Assert.assertEquals("(86) 1565220000", example5.getPersonOfficeTelephoneNumber());
        Assert.assertEquals("Ps天花乱坠", person.getName());
        Assert.assertEquals("art", hotel.getName());
        Assert.assertEquals("吉大", hotel.getStreet());
    }
}