package com.refactor.bootcamp.message_chains.example_1;

import org.junit.Assert;
import org.junit.Test;

public class MessageChainsExample1Test {
    @Test
    public void should_return_department_address() {
        Department dev = new Department("Dev", new Address("吉大中路"));
        MessageChainsExample1 example1 = new MessageChainsExample1(new Person(dev, "Ps天花乱坠"));

        Person person = example1.getPerson();

        Assert.assertEquals("吉大中路", person.getDepartment().getAddress().getStreet());
    }
}