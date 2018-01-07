package com.refactor.bootcamp.long_method.example_1;

import java.util.List;

public class LongMethodExample1 {
    private List<FrontendEngineer> frontendEngineers;

    public LongMethodExample1(List<FrontendEngineer> frontendEngineers) {
        this.frontendEngineers = frontendEngineers;
    }

    public String report() {
        StringBuilder builder = new StringBuilder();
        //banner
        String reportBanner = "************************\n" +
                              "****Engineer Report ****\n" +
                              "************************";
        builder.append(reportBanner);
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

}
