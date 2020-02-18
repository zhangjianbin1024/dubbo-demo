package com.myke.consumer;

import ch.qos.logback.classic.util.ContextInitializer;
import com.myke.consumer.service.OrderServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author: zh
 * @date: 2020/2/18/018 22:16
 */
@Slf4j
public class ConsumerApplication {
    static {
        //加载日载
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "logback-spring.xml");
    }

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        log.info(context.getDisplayName() + ": here");
        context.start();
        log.info(" ConsumerApplication 服务已经启动...");

        //dubbo 服务消费
        OrderServiceImpl orderService = context.getBean(OrderServiceImpl.class);
        orderService.say();

        System.in.read();
    }
}
