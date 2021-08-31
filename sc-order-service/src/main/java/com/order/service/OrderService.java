package com.order.service;

import com.order.entity.OrderDTO;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 12:16
 */
public interface OrderService {
    /**
     * 根据订单id查询信息
     * @param id
     * @return
     */
    OrderDTO get(Integer id);
}
