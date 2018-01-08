package com.refactor.bootcamp.long_method.example_2;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LongMethodExample2Test {
    @Test
    public void should_report_engineer_info() {
        ArrayList<FrontendEngineer> frontendEngineers = Lists.newArrayList(new FrontendEngineer(10), new FrontendEngineer(20));

        LongMethodExample2 example1 = new LongMethodExample2(frontendEngineers);
        String reportResult = example1.reportOwing();

        Assert.assertEquals(
            "************************\n" +
            "****Engineer Report ****\n" +
            "************************\n" +
            "totalAmount: 39.899\n" +
            "totalSize: 2\n" +
            "bonus: 10.42", reportResult);
    }

}