package com.user.service;

import com.user.entity.UserDO;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 11:50
 */
public interface UserService {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    UserDO get(Integer id);
}
