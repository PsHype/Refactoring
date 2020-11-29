package com.refactor.bootcamp.primitive_obsession.example_1;

import java.util.Iterator;
import java.util.List;

public class ReplaceValueWithObjectExample {

    private final Order order;

    public ReplaceValueWithObjectExample(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public int numberOrdersFor(List<Order> orders, String customer) {
        int result = 0;
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order each = iterator.next();
            if (each.getCustomer().equals(customer)) {
                result++;
            }
        }
        return result;
    }
}
