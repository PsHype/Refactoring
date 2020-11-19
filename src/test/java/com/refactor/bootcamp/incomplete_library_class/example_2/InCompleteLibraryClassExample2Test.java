package com.refactor.bootcamp.incomplete_library_class.example_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class InCompleteLibraryClassExample2Test {

    @Test
    public void should_return_billAmountDate() {
        InCompleteLibraryClassExample2 date = new InCompleteLibraryClassExample2();
        Date billAmountDate = date.getBillAmountDate();
        Assert.assertEquals(billAmountDate, new Date(2016, 10, 2));
    }
}