package com.twotanawin.orderDemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @GetMapping("/order")
    public String getOrder() {
        return "Test Order";
    }
}
