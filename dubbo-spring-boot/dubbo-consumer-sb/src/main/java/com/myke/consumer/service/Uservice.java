package com.myke.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.myke.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: zh
 * @date: 2020/3/7/007 11:44
 */
@Slf4j
@Component
public class Uservice {
    @Reference(validation = "true")
    private UserService userService;

    public void getUserAddress(String userId) {
        String result = userService.userAddress(userId);
        log.info("消费端请求结果:[{}]", result);
    }
}
