## 数据库单元测试

- 使用H2数据库
```xml
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <version>1.4.200</version>
    <scope>test</scope>
</dependency>
```

- schema.sql数据库表结果
- data.sql初始化数据

- 数据库连接
```properties
spring.datasource.url=jdbc:h2:mem:test;MODE=MYSQL;DB_CLOSE_DELAY=-1
spring.datasource.driver-class-name=org.h2.Driver
```

## Redis单元测试
使用一个独立的进程来模拟Redis服务器

- 引入RedisMock
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
```

- 启动Redis Server
参见: UnittestCustomContext

### 注意事项
- 不支持Spring Boot2.4.X