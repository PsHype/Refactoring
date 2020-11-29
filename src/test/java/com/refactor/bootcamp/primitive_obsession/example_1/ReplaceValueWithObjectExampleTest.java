package com.refactor.bootcamp.primitive_obsession.example_1;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReplaceValueWithObjectExampleTest {
    @Test
    public void should_return_correct_count_for_customer() {
        ReplaceValueWithObjectExample example =
                new ReplaceValueWithObjectExample(new Order("小帅"));

        ArrayList<Order> orders = Lists.newArrayList(
                new Order("小帅"),
                new Order("小帅"),
                new Order("小帅1"));
        int count = example.numberOrdersFor(orders, "小帅");

        assertEquals(2, count);
    }
}