package com.refactor.bootcamp.middle_man.example_1;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManExample1Test {
    @Test
    public void should_return_person_info() {
        MiddleManExample1 middleManExample1 = new MiddleManExample1(new Person(new Department("DEV", "IT", "China", "Beijing"), "Ps天花乱坠"));

        Person person = middleManExample1.getPerson();

        Assert.assertEquals("Ps天花乱坠", person.getName());
        Assert.assertEquals("DEV", person.getDepartmentName());
        Assert.assertEquals("IT", person.getGroup());
        Assert.assertEquals("China", person.getRegion());
        Assert.assertEquals("Beijing", person.getCity());
    }
}