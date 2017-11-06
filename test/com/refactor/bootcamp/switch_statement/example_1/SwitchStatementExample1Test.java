package com.refactor.bootcamp.switch_statement.example_1;

import org.junit.Assert;
import org.junit.Test;

public class SwitchStatementExample1Test {
    @Test
    public void should_return_computer_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double backEndEngineerBillableAmount = engineerFinance.getBillableAmount("Backend");

        Assert.assertEquals(88, backEndEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_civil_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double frontendEngineerBillableAmount = engineerFinance.getBillableAmount("Frontend");

        Assert.assertEquals(77, frontendEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_generate_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double fullStackEngineerBillableAmount = engineerFinance.getBillableAmount("FullStack");

        Assert.assertEquals(66, fullStackEngineerBillableAmount, 0.0);
    }
}