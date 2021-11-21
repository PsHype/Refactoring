package com.refactor.bootcamp.long_parameter_list;

import com.refactor.bootcamp.long_parameter_list.example_1.LongParameterListExample1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongParameterListExample1Test {
    @Test
    public void should_return_final_price() {
        LongParameterListExample1 listExample1 = new LongParameterListExample1();

        assertEquals(Double.valueOf(17.0), listExample1.calcFinalPrice());
    }
}