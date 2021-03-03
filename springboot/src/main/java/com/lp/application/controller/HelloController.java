package com.lp.application.controller;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		ImmutableMap<Integer, Integer> map  = ImmutableMap.<Integer,Integer>builder().put(1, 2).build();
		return  "hello world!";
	}
}
