package com.order.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author relax
 * @version 1.0
 * @功能描述：
 * @date 2021/9/1 14:15
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level feignLogLevel() {
        // 日志级别为BASIC
        return Logger.Level.FULL;
    }
}
