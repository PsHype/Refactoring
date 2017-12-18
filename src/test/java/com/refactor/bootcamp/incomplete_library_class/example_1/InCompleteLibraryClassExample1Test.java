package com.refactor.bootcamp.incomplete_library_class.example_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class InCompleteLibraryClassExample1Test {
    @Test
    public void should_return_billAmountDate() throws Exception {
        InCompleteLibraryClassExample1 date = new InCompleteLibraryClassExample1();
        Date billAmountDate = date.getBillAmountDate();
        Assert.assertEquals(billAmountDate, new Date(2016, 10, 2));
    }
}