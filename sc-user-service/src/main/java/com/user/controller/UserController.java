package com.user.controller;

import com.user.entity.UserDO;
import com.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

    @Value("${pattern.dateformat}")
    private String dateformat;

    @GetMapping("user/{id}")
    public UserDO get(@PathVariable("id") Integer id) {
        log.info("**{UserDO}**", id);
        return userService.get(id);
    }

    @GetMapping("now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
    }


}
