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
                              "************************\n";
        builder.append(reportBanner);

        //totalSize
        String totalSize = "totalSize: " + frontendEngineers.size();
        builder.append(totalSize);
        return builder.toString();
    }

}
