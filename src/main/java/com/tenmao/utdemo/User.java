package com.tenmao.utdemo;

import lombok.Builder;
import lombok.Data;

/**
 * @author timxia
 * @since 2020/12/16
 */
@Data
@Builder
public class User {
    private Integer id;
    private String name;
}
