package com.refactor.bootcamp.data_clumps.example_2;

import org.junit.Assert;
import org.junit.Test;

public class DataClumpsExample2Test {
    @Test
    public void should_place_order_success() {
        DataClumpsExample2 orderService = new DataClumpsExample2();
        String orderId = orderService.placeOrder("China", "Art Hotel", "Qing Lv Street", "156522", "shshao", "鱼香肉丝", 15.00);
        OrderEntity order = orderService.getOrder(orderId);
        Assert.assertEquals("China", order.getCity());
        Assert.assertEquals("Art Hotel", order.getAddress());
        Assert.assertEquals("Qing Lv Street", order.getStreet());
        Assert.assertEquals("156522", order.getPhoneNo());
        Assert.assertEquals("shshao", order.getName());
        Assert.assertEquals("鱼香肉丝", order.getOrderName());
        Assert.assertEquals(15.00, order.getPayAmount(), 0.0);
    }
}