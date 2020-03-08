package com.myke.consumer.service;


import com.alibaba.dubbo.rpc.RpcContext;
import com.myke.consumer.BaseTestApplication;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author: zh
 * @date: 2020/3/7/007 11:55
 */
public class UserviceTest extends BaseTestApplication {

    @Autowired
    private Uservice uservice;

    @Test
    public void getUserAddress() {
        // dubbo 调用 测试
        uservice.getUserAddress("1212");

    }

    @Test
    public void notNullUserAddress() {
        // 参数校验测试
        uservice.getUserAddress("");
    }

    @Test
    public void asyncUserAddress() {
        uservice.getUserAddress("12");
        Future<String> future = RpcContext.getContext().getFuture();
        try {
            //返回结果
            String result = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}