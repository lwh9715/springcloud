package com.order.controller;

import com.order.entity.OrderDTO;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 12:15
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("order/{id}")
    public OrderDTO get(@PathVariable("id") Integer id){
        return orderService.get(id);
    }



}
