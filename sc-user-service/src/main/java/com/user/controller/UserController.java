package com.user.controller;

import com.user.entity.UserDO;
import com.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/8/28 11:51
 */
@Slf4j
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("user/{id}")
    public UserDO get(@PathVariable("id") Integer id) {
        log.info("**{UserDO}**", id);
        return userService.get(id);
    }


}
