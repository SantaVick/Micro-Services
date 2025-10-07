package com.example.Notification.kafka.payment.order;

public record Customer(
        String id,
        String firstname,
        String lastname,
        String email
) {

}
