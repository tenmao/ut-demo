package com.tenmao.utdemo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author timxia
 * @since 2020/12/16
 */
@Component
public class UserManager {
    @Resource
    private UserMapper userMapper;

    public User getById(int id) {
        return userMapper.getById(id);
    }

    public int save(User user) {
        userMapper.insertOne(user);
        return user.getId();
    }
}
