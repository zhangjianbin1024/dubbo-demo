package com.myke.consumer.web;

import com.myke.consumer.service.Uservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zh
 * @date: 2020/3/7/007 12:18
 */
@RestController
public class UserController {
    @Autowired
    private Uservice uservice;

    @GetMapping("/api")
    public void getUserviceApi() {
        uservice.getUserAddress("101");
    }
}
