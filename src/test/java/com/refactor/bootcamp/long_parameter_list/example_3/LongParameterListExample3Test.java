package com.refactor.bootcamp.long_parameter_list.example_3;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class LongParameterListExample3Test {

    @Test
    public void should_return_200_of_ChargeValueBetween() {
        List<Entry> entries = Lists.newArrayList(new Entry(10, LocalDate.of(2012, 10, 10)),
                new Entry(10, LocalDate.of(2012, 10, 11)),
                new Entry(10, LocalDate.of(2012, 10, 12)));
        LongParameterListExample3 longParameterListExample3 = new LongParameterListExample3(entries);

        double flowBetween = longParameterListExample3.getChargeValueBetween(LocalDate.of(2012, 10, 10), LocalDate.of(2012, 10, 11));

        Assert.assertEquals(20, flowBetween, 0.0);

    }
}