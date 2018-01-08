package com.refactor.bootcamp.long_method.example_2;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class LongMethodExample2 {
    private List<FrontendEngineer> frontendEngineers;

    public LongMethodExample2(List<FrontendEngineer> frontendEngineers) {
        this.frontendEngineers = frontendEngineers;
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        builder.append(reportBanner());
        
        double totalAmount = 0;
        for (FrontendEngineer engineer : frontendEngineers) {
            totalAmount = totalAmount + engineer.getAmount();
        }
        builder.append("\n");
        builder.append("totalAmount: ").append(totalAmount);
        builder.append("\n");
        builder.append("totalSize: ").append(frontendEngineers.size());
        return builder.toString();
    }

    @NotNull
    private String reportBanner() {
        return "************************\n" +
            "****Engineer Report ****\n" +
            "************************";
    }

}
