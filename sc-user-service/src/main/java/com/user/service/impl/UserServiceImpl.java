package com.user.service.impl;

import com.user.entity.UserDO;
import com.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 11:51
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDO get(Integer id) {
        log.info("**get param:{}**", id);
        return new UserDO(1, "relax", "lwh9715", "lwh", "爱会东升西落，浪漫至死不渝");
    }
}
