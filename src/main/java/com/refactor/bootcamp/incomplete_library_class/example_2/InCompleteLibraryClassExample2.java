package com.refactor.bootcamp.incomplete_library_class.example_2;

import java.util.Date;

public class InCompleteLibraryClassExample2 {

    public Date getBillAmountDate() {
        Date date = new Date(2016, 10, 1);
        return nextDate(date);
    }

    private static Date nextDate(Date date) {
        //foreign method ,should be on date
        return new Date(date.getYear(), date.getMonth(), date.getDate() + 1);
    }

}
