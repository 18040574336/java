package liangpeng.demo.mvc.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import liangpeng.demo.service.IDemoService;
import liangpeng.mvcframework.annotation.GPAutowired;
import liangpeng.mvcframework.annotation.GPController;
import liangpeng.mvcframework.annotation.GPRequestMapping;
import liangpeng.mvcframework.annotation.GPRequestParam;


//虽然，用法一样，但是没有功能
@GPController
@GPRequestMapping("/demo")
public class DemoAction {

  	@GPAutowired
	private IDemoService demoService;

	@GPRequestMapping("/query")
	public void query(HttpServletRequest req, HttpServletResponse resp,
					  @GPRequestParam("name") String name){
//		String result = demoService.get(name);
		String result = "My name is " + name;
		try {
			resp.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/add")
	public void add(HttpServletRequest req, HttpServletResponse resp,
					@GPRequestParam("a") Integer a, @GPRequestParam("b") Integer b){
		try {
			resp.getWriter().write(a + "+" + b + "=" + (a + b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/sub")
	public void sub(HttpServletRequest req, HttpServletResponse resp,
					@GPRequestParam("a") Double a, @GPRequestParam("b") Double b){
		try {
			resp.getWriter().write(a + "-" + b + "=" + (a - b));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GPRequestMapping("/remove")
	public String  remove(@GPRequestParam("id") Integer id){
		return "" + id;
	}

}
