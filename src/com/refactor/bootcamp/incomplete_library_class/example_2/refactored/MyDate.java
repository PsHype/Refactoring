package com.refactor.bootcamp.incomplete_library_class.example_2.refactored;

import java.util.Date;

public class MyDate extends Date {
    public MyDate(long date) {
        super(date);
    }

    public MyDate(int year, int month, int date) {
        super(year, month, date);
    }

    Date nextDate() {
        //foreign method ,should be on date
        return new Date(getYear(), getMonth(), getDate() + 1);
    }
}
