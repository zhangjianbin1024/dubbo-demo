package com.myke.consumer.service;

import com.myke.consumer.api.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: zh
 * @date: 2020/2/18/018 22:19
 */
@Slf4j
public class OrderServiceImpl {
    public OrderServiceImpl() {
    }

    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    private UserService userService;

    public void say() {
        String result = userService.getUser();
        log.info("调用 userService 结果:[{}]", result);

    }
}
