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
public class OrderDTO implements Serializable {

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
}
