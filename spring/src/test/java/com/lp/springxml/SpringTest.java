package com.lp.springxml;

import com.lp.springxml.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;

/**
 * @Author: liangpeng
 * @Date: 2021/3/8 22:20
 */
public class SpringTest {

    @Test
    public void test(){

        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //   FileSystemXmlApplicationContext app = new FileSystemXmlApplicationContext("D:\\workProject\\idea\\java\\spring\\src\\main\\resources\\applicationContext.xml");
        //UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }

    @Test
    public void Test1(){
        String str1 = "旁侧板AAA塑料件VBV";
        byte[] bytes = new byte[0];
        try {
            bytes = str1.getBytes("windows-1252");
            String s = new String(bytes, "UTF-8");
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }


}
