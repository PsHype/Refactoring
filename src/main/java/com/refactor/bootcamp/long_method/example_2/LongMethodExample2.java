package com.refactor.bootcamp.long_method.example_2;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LongMethodExample2 {
    private List<FrontendEngineer> frontendEngineers;

    public LongMethodExample2(List<FrontendEngineer> frontendEngineers) {
        this.frontendEngineers = frontendEngineers;
    }

    public String reportOwing() {
        StringBuilder builder = new StringBuilder();
        double totalAmount;
        int size = frontendEngineers.size();
        double bonus = 5.21 * size;
        if (bonus > 10) {
            totalAmount = bonus * 0.95;
        } else {
            totalAmount = bonus * 0.98;
        }

        builder.append(reportBanner());

        for (FrontendEngineer engineer : frontendEngineers) {
            totalAmount = totalAmount + engineer.getAmount();
        }
        builder.append("totalAmount: ").append(totalAmount).append("\n");
        builder.append("totalSize: ").append(size).append("\n");
        builder.append("bonus: ").append(bonus);
        return builder.toString();
    }

    @NotNull
    private String reportBanner() {
        return "************************\n" +
            "****Engineer Report ****\n" +
            "************************\n";
    }

}
