package lp.service;

import javax.jws.WebService;

/**
 * @Author: liangpeng
 * @Date: 2021/5/9 20:45
 */
@WebService
public interface HelloWorld {

    String sayHello(String name,int age);
}
