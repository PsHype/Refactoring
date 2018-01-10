package com.refactor.bootcamp.large_class.example_2;

public class LargeClassExample2 {
    public static final String FRONTEND = "frontend";
    public static final String BACKEND = "backend";
    private String engineerType;
    private String name;
    private int baseAmount;
    private String phoneNo;
    private PayService payService;

    public LargeClassExample2(String engineerType, String name, int baseAmount, String phoneNo) {
        this.engineerType = engineerType;
        this.name = name;
        this.baseAmount = baseAmount;
        this.phoneNo = phoneNo;
        payService = new PayService();
    }

    public void payoff() {
        double payAmount = getPayAmount();
        payService.pay(payAmount, name, phoneNo);
    }

    private double getPayAmount() {
        double payAmount = 0;
        if (FRONTEND.equals(engineerType)) {
            payAmount = 110;
        }
        if (BACKEND.equals(engineerType)) {
            payAmount = baseAmount;
        }
        return payAmount;
    }

    public PayService getPayService() {
        return payService;
    }
}
