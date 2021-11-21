package com.refactor.bootcamp.long_parameter_list.example_3;

import java.time.LocalDate;
import java.util.List;

public class Account {
    private List<Entry> entries;

    public Account(List<Entry> entries) {
        this.entries = entries;
    }


    public double getChargeValueBetween(LocalDate startDate, LocalDate endDate) {
        double result = 0;
        for (Entry entry : entries) {
            if (entry.getChargeDate().equals(startDate) || entry.getChargeDate().equals(endDate)
                    || (entry.getChargeDate().isAfter(startDate) && entry.getChargeDate().isBefore(endDate))
            ) {
                result += entry.getValue();
            }
        }
        return result;
    }

}
