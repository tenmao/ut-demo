package com.tenmao.utdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author timxia
 * @since 2020/12/21
 */
@SpringBootTest
class RedisUtManagerTest {
    @Resource
    private RedisUtManager redisUtManager;

    @Test
    void getOrCreateToken() {
        String token = redisUtManager.getOrCreateToken();
        String token2 = redisUtManager.getOrCreateToken();
        Assertions.assertEquals(token, token2);
    }
}