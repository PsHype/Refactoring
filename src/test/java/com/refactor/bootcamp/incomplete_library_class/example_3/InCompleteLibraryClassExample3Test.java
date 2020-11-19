package com.refactor.bootcamp.incomplete_library_class.example_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class InCompleteLibraryClassExample3Test {

    @Test
    public void should_return_billAmountDate() {
        InCompleteLibraryClassExample3 date = new InCompleteLibraryClassExample3();
        Date billAmountDate = date.getBillAmountDate();
        Assert.assertEquals(billAmountDate, new Date(2016, 10, 2));
    }
}