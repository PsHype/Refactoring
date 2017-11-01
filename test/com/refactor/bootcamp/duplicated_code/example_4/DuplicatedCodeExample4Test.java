package com.refactor.bootcamp.duplicated_code.example_4;

import com.refactor.bootcamp.EngineerNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicatedCodeExample4Test {

    @Test
    public void should_return_computer_engineer() {
        DuplicatedCodeExample4 engineerFinder = new DuplicatedCodeExample4(buildData());

        String name = engineerFinder.findBackendEngineer();

        Assert.assertEquals("Tom", name);
    }

    @Test(expected = EngineerNotFoundException.class)
    public void should_throw_not_found_exception_when_computer_engineer_not_exist() {
        new DuplicatedCodeExample4(new HashMap<>()).findBackendEngineer();
    }

    @Test
    public void should_return_civil_engineer() {
        DuplicatedCodeExample4 engineerFinder = new DuplicatedCodeExample4(buildData());

        String name = engineerFinder.findFrontendEngineer();

        Assert.assertEquals("Jack", name);
    }

    @Test(expected = EngineerNotFoundException.class)
    public void should_throw_not_found_exception_when_civil_engineer_not_exist() {
        new DuplicatedCodeExample4(new HashMap<>()).findFrontendEngineer();
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