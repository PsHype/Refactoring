package com.refactor.bootcamp.middle_man.example_3;

import java.math.BigDecimal;

public class Frontend {
    private Engineer engineer;

    public Frontend(Engineer engineer) {
        this.engineer = engineer;
    }

    public String getBillableAmount() {
        double billableAmount = engineer.getBillableAmount();
        return new BigDecimal(billableAmount).setScale(2).toString();
    }

    public String getName() {
        return engineer.getName();
    }

    public int getAge() {
        return engineer.getAge();
    }

    @Override
    public String toString() {
        return "frontend: " + engineer.getLastName();
    }
}
