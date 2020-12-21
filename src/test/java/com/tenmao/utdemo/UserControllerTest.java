package com.tenmao.utdemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author timxia
 * @since 2020/12/21
 */
@SpringBootTest
//配置mock
@AutoConfigureMockMvc
class UserControllerTest {
    @Resource
    private MockMvc mvc;

    @Test
    void detail() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/detail?id=1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"id\":1,\"name\":\"test_123\"}"));

        mvc.perform(MockMvcRequestBuilders.get("/user/detail?id=2").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(""));
    }

}