package liangpeng.demo.service.impl;

import liangpeng.demo.service.IDemoService;
import liangpeng.mvcframework.annotation.GPService;
/**
 * 核心业务逻辑
 */
@GPService
public class DemoService implements IDemoService {

	public String get(String name) {
		return "My name is " + name + ",from service.";
	}

}
