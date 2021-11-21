package com.refactor.bootcamp.long_parameter_list.example_1;

public class LongParameterListExample1 {
    private int quantity;
    private int itemPrice;
    private double seasonalDiscount;

    public LongParameterListExample1() {
        this.quantity = 10;
        this.itemPrice = 2;
        this.seasonalDiscount = 0.8;
    }

    public Double calcFinalPrice() {
        int basePrice = quantity * itemPrice;
        double seasonDiscount = this.getSeasonalDiscount();
        double fees = this.getFees();
        return discountedPrice(basePrice, seasonDiscount, fees);
    }

    private Double discountedPrice(int basePrice, double seasonDiscount, double fees) {
        return basePrice * seasonDiscount + fees;
    }

    private double getFees() {
        return 0.1 * quantity;
    }

    public double getSeasonalDiscount() {
        return seasonalDiscount;
    }
}
