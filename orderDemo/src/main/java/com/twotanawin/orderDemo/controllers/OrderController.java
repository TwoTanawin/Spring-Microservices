package com.twotanawin.orderDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api")
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "Test Order";
    }

    @GetMapping("/order/{id}")
    public String getOrderById(@PathVariable Long id) {
        return "Test Order " + id;
    }
}
