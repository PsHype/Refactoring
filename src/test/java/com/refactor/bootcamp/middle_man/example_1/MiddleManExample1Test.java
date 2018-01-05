package com.refactor.bootcamp.middle_man.example_1;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManExample1Test {
    @Test
    public void should_return_person_info() {
        MiddleManExample1 example1 = new MiddleManExample1();

        Person person = example1.getPerson();
        Assert.assertEquals("well", person.getName());
        Department department = person.getDepartment();
    }
}