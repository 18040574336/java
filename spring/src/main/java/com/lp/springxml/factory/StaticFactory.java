package com.lp.springxml.factory;

import com.lp.springxml.dao.impl.UserDaoImpl;

/**
 * @Author: liangpeng
 * @Date: 2021/3/9 20:37
 */
public class StaticFactory {


    public static UserDaoImpl getUserDao(){
        System.out.println("静态工厂创建");
        return  new UserDaoImpl();
    }
}
