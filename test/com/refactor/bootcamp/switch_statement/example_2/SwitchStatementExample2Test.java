package com.refactor.bootcamp.switch_statement.example_2;

import org.junit.Assert;
import org.junit.Test;

public class SwitchStatementExample2Test {
    @Test
    public void should_return_computer_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2("Backend");

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount(100);

        Assert.assertEquals(88, civilEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_civil_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2("Frontend");

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount(100);

        Assert.assertEquals(77, civilEngineerBillableAmount, 0.0);
    }

    @Test
    public void should_return_generate_engineer_billable_amount() {
        SwitchStatementExample2 engineerFinance = new SwitchStatementExample2("FullStack");

        double civilEngineerBillableAmount = engineerFinance.getBillableAmount(100);

        Assert.assertEquals(66, civilEngineerBillableAmount, 0.0);
    }

}