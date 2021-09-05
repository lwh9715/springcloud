package com.order.service.impl;

import com.order.entity.OrderDO;
import com.order.entity.OrderDTO;
import com.order.entity.UserDO;
import com.order.feign.UserClient;
import com.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 12:16
 */


@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    private static final String Url = "http://user-server/user/";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private UserClient userClient;

    @Override
    public OrderDTO get(Integer id) {

        log.info("**{OrderDTO}**", id);

//        String url = Url + id;
//        UserDO user = restTemplate.getForObject(url, UserDO.class);

        UserDO user = userClient.findById(id);
        OrderDO orderDO = new OrderDO(1, "3189HongKong", "100.0", "香港九龙", user);
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderNo(orderDO.getOrderNo());
        orderDTO.setOrderPrice(orderDO.getOrderPrice());
        orderDTO.setOrderAddress(orderDO.getOrderAddress());
        orderDTO.setUser(orderDO.getUser());
        return orderDTO;
    }
}
