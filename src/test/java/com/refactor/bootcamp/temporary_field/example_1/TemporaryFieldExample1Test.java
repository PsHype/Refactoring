package com.refactor.bootcamp.temporary_field.example_1;

import org.junit.Assert;
import org.junit.Test;

public class TemporaryFieldExample1Test {
    @Test
    public void should_calculate_estimate_reward_right() {
        TemporaryFieldExample1 example1 = new TemporaryFieldExample1(1000);

        int month = 1;
        double estimateReward = example1.estimateReward(month);

        Assert.assertEquals(2300.0, estimateReward, 0.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_calculate_estimate_reward_failed() {
        new TemporaryFieldExample1(1000).estimateReward(null);

    }
}