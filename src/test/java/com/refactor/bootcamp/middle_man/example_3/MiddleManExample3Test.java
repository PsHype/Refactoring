package com.refactor.bootcamp.middle_man.example_3;

import org.junit.Assert;
import org.junit.Test;

public class MiddleManExample3Test {

    @Test
    public void test_frontend_engineer_info() {
        Engineer engineer = new Engineer("Ps 天花乱坠",18);
        Frontend frontend = new MiddleManExample3(new Frontend(engineer)).getFrontend();

        Assert.assertSame(18, frontend.getAge());
        Assert.assertEquals("Ps 天花乱坠", frontend.getName());
        Assert.assertEquals("frontend: 天花乱坠", frontend.toString());
        Assert.assertEquals("77.00", frontend.getBillableAmount());
    }
}