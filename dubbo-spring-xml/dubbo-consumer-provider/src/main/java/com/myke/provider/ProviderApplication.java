package com.myke.provider;

import ch.qos.logback.classic.util.ContextInitializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * 服务启动类
 *
 * @author: zh
 * @date: 2020/2/17/017 22:07
 */
@Slf4j
public class ProviderApplication {
    static {
        //加载日载
        System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "logback-spring.xml");
    }

    public static void main(String[] args) throws IOException {

        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        //log.info(context.getDisplayName() + ": here");
        //
        //
        //context.start();

        log.info("服务已经启动...");
        System.in.read();
    }
}
