package com.lp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @Author: liangpeng
 * @Date: 2022/4/26 21:55
 */
public class RedisService {

    @Autowired
    RedisTemplate redisTemplate;

    public void test(){


    }
}
