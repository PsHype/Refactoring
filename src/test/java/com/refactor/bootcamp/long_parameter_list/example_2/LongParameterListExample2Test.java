package com.refactor.bootcamp.long_parameter_list.example_2;

import org.junit.Assert;
import org.junit.Test;

public class LongParameterListExample2Test {
    @Test
    public void should_in_plan() {
        LongParameterListExample2 listExample1 = new LongParameterListExample2(new LongParameterListExample2.HeatingPlan(new DaysTempRange(1, 10)));

        final DaysTempRange daysTempRange = new DaysTempRange(3, 8);
        Assert.assertTrue(listExample1.isWithinPlan(daysTempRange.getLow(), daysTempRange.getHigh()));
    }

    @Test
    public void should_not_in_plan() {
        LongParameterListExample2 listExample1 = new LongParameterListExample2(new LongParameterListExample2.HeatingPlan(new DaysTempRange(2, 8)));

        final DaysTempRange daysTempRange = new DaysTempRange(1, 8);
        Assert.assertFalse(listExample1.isWithinPlan(daysTempRange.getLow(), daysTempRange.getHigh()));
    }
}