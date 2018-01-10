package com.refactor.bootcamp.large_class.example_2;

public class PayService {

    private String message;


    public void pay(double payAmount, String name, String phoneNo) {
        int length = phoneNo.length();
        message = "尊敬的" + name + "您的手机尾号" + phoneNo.substring(length - 4, length) + "入帐工资为:" + payAmount;
    }

    public String getMessage() {
        return message;
    }
}
