package com.tenmao.utdemo;

/**
 * @author timxia
 * @since 2020/12/16
 */
public class BaseUt {
    /**
     * 正数相加.
     *
     * @param a 加数
     * @param b 被加数
     * @return a + b
     */
    public static int positiveAdd(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException();
        }
        return a + b;
    }
}
