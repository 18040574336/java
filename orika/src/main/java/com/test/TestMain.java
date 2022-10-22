package com.test;

import com.test.model.User;
import com.test.model.UserA;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * @Author: liangpeng
 * @Date: 2021/5/8 13:47
 */
public class TestMain {


    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(User .class, UserA .class)
                .field("id", "id")
                .field("name", "name")
                .byDefault()
                .register();

        User user = new User();
        user.setId(123L);
        user.setName("小明");

        MapperFacade mapper = mapperFactory.getMapperFacade();

        UserA userA = mapper.map(user, UserA.class);
        System.out.println(userA.toString());
    }

}
