package com.refactor.bootcamp.middle_man.example_1;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManExample1Test {
    @Test
    public void should_return_person_info() {
        Department department = new Department("DEV", "IT", "China", "Beijing");
        Person person = new Person(department, "Ps天花乱坠");

        Assert.assertEquals("Ps天花乱坠", person.getName());
        Assert.assertEquals("DEV", person.getDepartmentName());
        Assert.assertEquals("IT", person.getGroup());
        Assert.assertEquals("China", person.getRegion());
        Assert.assertEquals("Beijing", person.getCity());
    }
}