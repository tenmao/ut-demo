package com.tenmao.utdemo;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author timxia
 * @since 2020/12/21
 */
@Component
public class RedisUtManager {
    private static final String KEY = "tenmao.biz.token";
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public String getOrCreateToken() {
        String token = stringRedisTemplate.opsForValue().get(KEY);
        if (token == null) {
            token = UUID.randomUUID().toString();
            stringRedisTemplate.opsForValue().set(KEY, token);
        }
        return token;
    }
}
