package com.tenmao.utdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author timxia
 * @since 2020/12/16
 */
@RequestMapping("user")
@RestController
public class UserController {
    @Resource
    private UserManager userManager;

    @GetMapping("detail")
    public User detail(int id) {
        return userManager.getById(id);
    }
}
