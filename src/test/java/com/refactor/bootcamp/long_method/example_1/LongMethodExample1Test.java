package com.refactor.bootcamp.long_method.example_1;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class LongMethodExample1Test {
    @Test
    public void should_report_engineer_info() {
        ArrayList<FrontendEngineer> frontendEngineers = Lists.newArrayList(new FrontendEngineer(10), new FrontendEngineer(20));
        
        LongMethodExample1 example1 = new LongMethodExample1(frontendEngineers);
        String reportResult = example1.report();

        Assert.assertEquals("************************\n" +
            "****Engineer Report ****\n" +
            "************************\n" +
            "totalAmount: 30.0\n" +
            "totalSize: 2", reportResult);
    }
}