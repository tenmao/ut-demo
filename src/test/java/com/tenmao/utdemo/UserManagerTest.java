package com.tenmao.utdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * 依赖Spring环境的单元测试.
 */
@SpringBootTest
class UserManagerTest {
    @Resource
    private UserManager userManager;

    @Test
    void getById() {
        User user = userManager.getById(1);
        Assertions.assertEquals(1, user.getId());
        Assertions.assertNotNull(user.getName());
    }
}