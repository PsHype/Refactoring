package com.refactor.bootcamp.duplicated_code.example_1;

import com.refactor.bootcamp.EngineerNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedCodeExample1Test {

    @Test
    public void should_return_computer_engineer() {
        DuplicatedCodeExample1 engineerFinder = new DuplicatedCodeExample1(buildData());

        String name = engineerFinder.findComputerEngineer();

        Assert.assertEquals("Tom", name);
    }

    @Test(expected = EngineerNotFoundException.class)
    public void should_throw_not_found_exception_when_computer_engineer_not_exist() {
        new DuplicatedCodeExample1(new HashMap<>()).findComputerEngineer();
    }

    @Test
    public void should_return_civil_engineer() {
        DuplicatedCodeExample1 engineerFinder = new DuplicatedCodeExample1(buildData());

        String name = engineerFinder.findCivilEngineer();

        Assert.assertEquals("Jack", name);
    }

    @Test(expected = EngineerNotFoundException.class)
    public void should_throw_not_found_exception_when_civil_engineer_not_exist() {
        new DuplicatedCodeExample1(new HashMap<>()).findCivilEngineer();
    }


    private Map<String, String> buildData() {
        return new HashMap<String, String>() {
            {
                put("Backend", "Tom");
                put("Frontend", "Jack");
            }
        };
    }
}