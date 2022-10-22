package lp.service.impl;

import lp.service.HelloWorld;


/**
 * @Author: liangpeng
 * @Date: 2021/5/9 20:46
 */
public class HelloWorldImpl implements HelloWorld {
    public String sayHello(String name, int age) {
        System.out.println("大家好，我是：" +name + age);
        return "大家好，我是：" +name + age;
    }
}
