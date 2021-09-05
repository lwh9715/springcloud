package com.order.feign;

import com.order.entity.UserDO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author relax
 * @version 1.0
 * @功能描述：用户中心服务feign
 * @date 2021/9/1 13:57
 */

@Component
@FeignClient("user-server")
public interface UserClient {

    /**
     * 查询用户id
     * @param id
     * @return
     */
    @GetMapping("/user/{id}")
    UserDO findById(@PathVariable("id") Integer id);

}
