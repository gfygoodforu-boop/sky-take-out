package com.sky.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
@Slf4j
public class RedisConfiguration {

    @Bean   // @Bean作用是把方法返回的对象交给 Spring 容器管理
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){ // 这个参数 Spring 会自动注入
        log.info("开始创建redis模板对象...");
        RedisTemplate redisTemplate = new RedisTemplate();

        // 设置redis的连接工厂对象  也就是绑定 Redis 服务器
        redisTemplate.setConnectionFactory(redisConnectionFactory);

        // 设置redis key的序列化器   如果不设置: Redis key 会变成乱码
        redisTemplate.setKeySerializer(new StringRedisSerializer());

        return redisTemplate;
    }

}
