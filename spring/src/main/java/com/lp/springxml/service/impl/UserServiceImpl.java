package com.lp.springxml.service.impl;

import com.lp.springxml.dao.UserDao;
import com.lp.springxml.model.User;
import com.lp.springxml.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: liangpeng
 * @Date: 2021/3/9 21:04
 */
public class UserServiceImpl implements UserService {

    private List<String> list;
    private Map<String, User> map;

    private Properties pros;


    private  String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public UserServiceImpl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    public Properties getPros() {
        return pros;
    }

    public void setPros(Properties pros) {
        this.pros = pros;
    }

    public UserServiceImpl() {
    }

    public void save() {
        System.out.println("list==="+list);
        System.out.println("map==="+map);
        System.out.println("pros==="+pros);
    }
}
