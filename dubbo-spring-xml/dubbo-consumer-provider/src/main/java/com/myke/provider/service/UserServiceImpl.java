package com.myke.provider.service;

import com.myke.consumer.api.UserService;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: zh
 * @date: 2020/2/17/017 22:29
 */
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public String getUser() {
        String result = "hello world";
        log.info("getUser result:[{}]", result);
        return result;
    }
}
