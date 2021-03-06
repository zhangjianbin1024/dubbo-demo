package com.myke.provider;

import ch.qos.logback.classic.util.ContextInitializer;
import com.myke.provider.service.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{
                        "dubbo-provider.xml"});
        log.info(context.getDisplayName() + ": here");
        context.start();
        log.info("userService beanName:[{}]", context.getBeanNamesForType(UserServiceImpl.class));

        log.info("ProviderApplication 服务已经启动...");
        System.in.read();
    }
}
