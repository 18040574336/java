package com.lp.springxml.dao.impl;

import com.lp.springxml.dao.UserDao;

/**
 * @Author: liangpeng
 * @Date: 2021/3/8 20:56
 */
public class UserDaoImpl implements UserDao {
    public void say() {
        System.out.println("hello world!");
    }

    public UserDaoImpl() {
        System.out.println("构造函数执行。。。。");
    }

    public void init(){
        System.out.println("init");
    }

    public void destory(){
        System.out.println("destory");
    }
}
