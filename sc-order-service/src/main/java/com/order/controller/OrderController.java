package com.order.controller;

import com.order.entity.OrderDTO;
import com.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 12:15
 */

@Slf4j
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @Value("${pattern.dateformat}")
    private String dateformat;

    @GetMapping("order/{id}")
    public OrderDTO get(@PathVariable("id") Integer id,
                        @RequestHeader(value = "Truth", required = false) String Truth) {
        log.info("***{默认过滤器-添加请求头}***" + Truth);
        return orderService.get(id);
    }

    @GetMapping("now")
    public String now() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }


}
