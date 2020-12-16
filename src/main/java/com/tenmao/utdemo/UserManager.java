package com.tenmao.utdemo;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author timxia
 * @since 2020/12/16
 */
@Component
public class UserManager {
    public User getById(int id) {
        return User.builder().id(id).name(UUID.randomUUID().toString()).build();
    }
}
