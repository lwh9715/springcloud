package com.order.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 11:57
 */

@Data
public class UserDO implements Serializable {

    private Integer id;
    /**
     * 用户名
     */
    private String name;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 内容
     */
    private String content;

    public UserDO() {
    }

    public UserDO(Integer id, String name, String account, String password, String content) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.content = content;
    }
}
