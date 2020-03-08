package com.myke.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.myke.api.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: zh
 * @date: 2020/3/7/007 11:41
 */
@Slf4j
//@Service 属于Dubbo的@Service注解，非Spring  作用：暴露服务
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String userAddress(String userId) {
        log.info("请求提供者服者参数:[{}]", userId);
        return userId;
    }
}
