package com.refactor.bootcamp.duplicated_code.example_3;

import org.junit.Assert;
import org.junit.Test;

public class DuplicatedCodeExample3Test {

    @Test
    public void should_return_computer_engineer_billable_amount() {
        DuplicatedCodeExample3 engineer = new DuplicatedCodeExample3(100d);

        Assert.assertEquals(120, engineer.getBackendBillableAmount(), 0.0);
    }

    @Test
    public void should_return_civil_engineer_billable_amount() {
        DuplicatedCodeExample3 engineer = new DuplicatedCodeExample3(100d);

        Assert.assertEquals(88.0, engineer.getFrontendBillableAmount(), 0.0);
    }
}