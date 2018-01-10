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
            int bonus = 100;
            payAmount = baseAmount + bonus;
        }
        if (BACKEND.equals(engineerType)) {
            int bonus = 110;
            payAmount = baseAmount + bonus;
        }
        return payAmount;
    }

    public PayService getPayService() {
        return payService;
    }
}
