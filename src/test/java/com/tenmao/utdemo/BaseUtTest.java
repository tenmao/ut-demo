package com.tenmao.utdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

/**
 * 基本测试.
 *
 * @author timxia
 * @since 2020/12/16
 */
class BaseUtTest {

    @Test
    void add() {
        //相等断言
        Assertions.assertEquals(2, BaseUt.positiveAdd(1, 1));

        //异常断言
        Assertions.assertThrows(IllegalArgumentException.class, () -> BaseUt.positiveAdd(-1, -1));

        //耗时断言
        Assertions.assertTimeout(Duration.ofSeconds(2), () -> Thread.sleep(1));
    }
}