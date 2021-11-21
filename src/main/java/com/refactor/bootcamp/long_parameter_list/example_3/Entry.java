package com.refactor.bootcamp.long_parameter_list.example_3;

import java.time.LocalDate;

public class Entry {
    private double value;
    private LocalDate chargeDate;

    public Entry(double value, LocalDate chargeDate) {
        this.value = value;
        this.chargeDate = chargeDate;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getChargeDate() {
        return chargeDate;
    }
}
