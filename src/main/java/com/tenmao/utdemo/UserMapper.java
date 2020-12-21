package com.tenmao.utdemo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

/**
 * @author timxia
 * @since 2020/12/16
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id=#{id}")
    User getById(int id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO user(name) VALUES (#{name})")
    int insertOne(User user);
}
