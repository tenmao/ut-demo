# 单元测试中创建数据库表结构
# 常见错误：不支持表注释，支持列注释； H2中不同表的索引名字也不可以相同
CREATE TABLE `user`
(
    `id`   int         NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_name` (`name`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;