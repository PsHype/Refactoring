package com.refactor.bootcamp.switch_statement.example_2;

import org.junit.Assert;
import org.junit.Test;

public class SwitchStatementExample2Test {
    @Test
    public void should_return_computer_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2();

        double backEndEngineerBillableAmount = engineerFinance.getBackEndBillAmount(100);

        Assert.assertEquals(88, backEndEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_civil_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2();

        double frontendEngineerBillableAmount = engineerFinance.getFrontendBillableAmount(100);

        Assert.assertEquals(77, frontendEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_generate_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2();

        double fullStackEngineerBillableAmount = engineerFinance.getFullStackBillAmount(100);

        Assert.assertEquals(66, fullStackEngineerBillableAmount, 0.0);
    }

}