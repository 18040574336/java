package com.lp.springxml.test;

import com.lp.springxml.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: liangpeng
 * @Date: 2021/3/8 21:03
 */
public class Test {

    public static void main(String[] args) {

        String reg = "^[0-9]+(.[0-9]+)?$";

        boolean matches = "0.123a123".matches(reg);
        System.out.println(matches);

//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) app.getBean("userDao");
//        System.out.println(userDao);
//        userDao.say();
    }
}
