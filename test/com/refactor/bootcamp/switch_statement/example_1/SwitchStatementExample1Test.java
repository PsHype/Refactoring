package com.refactor.bootcamp.switch_statement.example_1;

import org.junit.Assert;
import org.junit.Test;

public class SwitchStatementExample1Test {
    @Test
    public void should_return_computer_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount("Backend");

        Assert.assertEquals(88, civilEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_civil_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount("Frontend");

        Assert.assertEquals(77, civilEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_generate_engineer_billable_amount() {
        SwitchStatementExample1 engineerFinance = new SwitchStatementExample1(100);

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount("FullStack");

        Assert.assertEquals(66, civilEngineerBillableAmount, 0.0);
    }
}