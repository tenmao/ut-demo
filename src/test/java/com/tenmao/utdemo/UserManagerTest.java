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
        User user = new User(null, "test_name");
        int id1 = userManager.save(user);

        User userInDb = userManager.getById(id1);
        Assertions.assertEquals(user, userInDb);
    }
}