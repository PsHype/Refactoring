package com.refactor.bootcamp.large_class.example_2;

import org.junit.Assert;
import org.junit.Test;

public class LargeClassExample2Test {

    @Test
    public void should_be_income_right_when_engineer_is_frontend() {
        LargeClassExample2 example2 = new LargeClassExample2(LargeClassExample2.FRONTEND, "Ps天花乱坠", 100, "156522682");

        example2.payoff();

        PayService payService = example2.getPayService();
        Assert.assertEquals("尊敬的Ps天花乱坠您的手机尾号2682入帐工资为:110.0", payService.getMessage());

    }

    @Test
    public void should_be_income_right_when_engineer_is_backend() {
        LargeClassExample2 example2 = new LargeClassExample2(LargeClassExample2.BACKEND, "Ps天花乱坠", 100, "156522682");

        example2.payoff();

        PayService payService = example2.getPayService();
        Assert.assertEquals("尊敬的Ps天花乱坠您的手机尾号2682入帐工资为:100.0", payService.getMessage());
    }
}