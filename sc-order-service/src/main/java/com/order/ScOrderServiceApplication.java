package com.order;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author relax
 */
@SpringBootApplication
public class ScOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScOrderServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 负载均衡策略 1）代码方式，在order-service的启动类中，定义一个新的IRule
     * @return
     */
//    @Bean
//    public IRule randomRule(){
//        return new RandomRule();
//    }
}
