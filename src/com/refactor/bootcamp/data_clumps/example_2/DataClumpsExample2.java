package com.refactor.bootcamp.data_clumps.example_2;

public class DataClumpsExample2 {
    private static final String ORDER_ID = "110101";
    private OrderEntity orderEntity;

    public String placeOrder(String city, String address, String street, String phoneNo, String name, String orderName, double payAmount) {
        //wechat pay success
        //save order ok
        orderEntity = new OrderEntity(city, street, address, name, phoneNo, orderName, payAmount);
        return ORDER_ID;
    }

    public OrderEntity getOrder(String orderId) {
        if (orderId.equals(ORDER_ID))
            return orderEntity;
        return null;
    }
}
