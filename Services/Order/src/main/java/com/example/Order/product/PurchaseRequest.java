package com.example.Order.product;

import java.math.BigDecimal;

public record PurchaseRequest(
        Integer productId,
        String name,
        String description,
        BigDecimal price,
        double quantity
) {
}