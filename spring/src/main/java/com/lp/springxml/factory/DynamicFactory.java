package com.lp.springxml.factory;

import com.lp.springxml.dao.impl.UserDaoImpl;

/**
 * @Author: liangpeng
 * @Date: 2021/3/9 20:42
 */
public class DynamicFactory {

    public  UserDaoImpl getUserDao(){
        System.out.println("实例工厂创建");
        return  new UserDaoImpl();
    }
}
