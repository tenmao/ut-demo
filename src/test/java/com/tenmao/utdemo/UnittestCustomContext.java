package com.tenmao.utdemo;

import com.github.tenmao.redismock.RedisServer;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;
import java.io.IOException;

@Component
class UnittestCustomContext implements BeanFactoryPostProcessor, ApplicationListener<ApplicationContextEvent> {
    private static RedisServer redisServer = null;

    @Override
    public void onApplicationEvent(@Nonnull ApplicationContextEvent event) {
        if (event instanceof ContextClosedEvent) {
            //Spring上下文结束后清理自定义上下文
            System.out.println("tenmao unit test for event: " + event);
            if (redisServer != null) {
                redisServer.stop();
            }
        }
    }

    @Override
    public void postProcessBeanFactory(@Nonnull ConfigurableListableBeanFactory beanFactory) throws BeansException {
        try {
            //Spring上下文初始化之前 配置自定义上下文，也可以修改Spring配置信息
            redisServer = RedisServer.newRedisServer();
            redisServer.start();
            //因为端口是系统分配的，不是固定的，为了客户端可以接入，所以需要写到spring配置参数里面spring.redis.port
            System.setProperty("spring.redis.port", Integer.toString(redisServer.getBindPort()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}