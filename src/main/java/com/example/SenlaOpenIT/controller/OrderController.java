package com.example.SenlaOpenIT.controller;

import com.example.SenlaOpenIT.model.Order;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {


    @GetMapping
    private List<Order> getAll() {
        return null;
    }

    @PostMapping()
    public void saveOrder(@RequestBody Order order) {
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable("id") Long id, @RequestBody Order order) {
       return null;
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id) {

    }
}
