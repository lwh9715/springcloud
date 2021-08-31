package com.order.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 12:18
 */
@Data
public class OrderDO implements Serializable {

    private Integer id;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 订单价格
     */
    private String orderPrice;
    /**
     * 订单地址
     */
    private String orderAddress;
    /**
     * 用户id
     */
    private UserDO user;

    public OrderDO() {
    }

    public OrderDO(Integer id, String orderNo, String orderPrice, String orderAddress, UserDO user) {
        this.id = id;
        this.orderNo = orderNo;
        this.orderPrice = orderPrice;
        this.orderAddress = orderAddress;
        this.user = user;
    }

}
