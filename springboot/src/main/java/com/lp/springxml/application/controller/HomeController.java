package com.lp.springxml.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
    private ThreadLocal<Integer> i = new ThreadLocal<>();
    @GetMapping("testsingleton1")
    @ResponseBody
    public int test1() {
        if (i.get() == null) {
            i.set(0);
        }
        i.set(i.get().intValue() + 1);
        int i1 = i.get().intValue();
        System.out.println(Thread.currentThread().getName()+"--->"+ i1);
        i.remove();
        return i1;
    }
}