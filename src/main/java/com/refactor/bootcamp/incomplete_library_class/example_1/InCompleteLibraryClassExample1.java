package com.refactor.bootcamp.incomplete_library_class.example_1;

import java.util.Date;

public class InCompleteLibraryClassExample1 {

    public Date getBillAmountDate() {
        Date date = new Date(2016, 10, 1);
        return new Date(date.getYear(), date.getMonth(), date.getDate() + 1);
    }

}
