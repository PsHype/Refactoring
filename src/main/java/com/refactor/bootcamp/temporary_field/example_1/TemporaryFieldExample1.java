package com.refactor.bootcamp.temporary_field.example_1;

public class TemporaryFieldExample1 {

    private final int base;
    private Integer month;
    private double sum;
    private int sumDiem;

    public TemporaryFieldExample1(int base) {
        this.base = base;
    }


    public double estimateReward(Integer month) {
        if (month == null) {
            throw new IllegalArgumentException("month must not be null");
        }
        this.month = month;
        calculateSumAmount();
        estimateRewardSubsidy();
        return sum + sumDiem;
    }

    private void estimateRewardSubsidy() {
        int days = 30;
        int perDiem = 50;
        this.sumDiem = perDiem * days;
    }

    private void calculateSumAmount() {
        int sumBase = base * month;
        double sumTax = sumBase * 0.2;
        this.sum = sumBase - sumTax;
    }


}
