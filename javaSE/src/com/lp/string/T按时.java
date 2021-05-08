package com.lp.string;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: liangpeng
 * @Date: 2021/3/5 10:47
 */
public class T按时 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("张三",23));
        list.add(new Person("李四",24));

        List<PersonDto> collect = list.stream().map(PersonDto::new).collect(Collectors.toList());
        collect.forEach(p->{
            System.out.println(p.getName()+p.getAge());
        });
    }
}
