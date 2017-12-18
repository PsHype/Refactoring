package com.refactor.bootcamp.incomplete_library_class.example_3.refactored;

import java.time.Instant;
import java.util.Date;

public class DateWrap {
    private Date original;

    public DateWrap(Date original) {
        this.original = original;
    }

    public long getTime() {
        return original.getTime();
    }

    public void setTime(long time) {
        original.setTime(time);
    }

    public boolean before(Date when) {
        return original.before(when);
    }

    public boolean after(Date when) {
        return original.after(when);
    }

    public int compareTo(Date anotherDate) {
        return original.compareTo(anotherDate);
    }

    public static Date from(Instant instant) {
        return Date.from(instant);
    }

    public Instant toInstant() {
        return original.toInstant();
    }


    public Date nextDate() {
        //foreign method ,should be on date
        return new Date(original.getYear(), original.getMonth(), original.getDate() + 1);
    }
}
