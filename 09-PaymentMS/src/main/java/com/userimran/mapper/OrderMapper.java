package com.userimran.mapper;

import com.razorpay.Order;
import com.userimran.dto.OrderResponse;

public class OrderMapper {

    public static OrderResponse convertToOrderResponse(Order order) {
        OrderResponse orderResponse = new OrderResponse();
        orderResponse.setId(order.get("id"));
        orderResponse.setAmount(order.get("amount"));
        orderResponse.setCurrency(order.get("currency"));
        orderResponse.setStatus(order.get("status"));
        orderResponse.setReceipt(order.get("receipt"));
        return orderResponse;
    }
}
