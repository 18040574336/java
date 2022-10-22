package lp.client;

import lp.service.HelloWorld;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Author: liangpeng
 * @Date: 2021/5/9 23:04
 */
public class ClientTest {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/webservice");
        jaxWsProxyFactoryBean.setServiceClass(HelloWorld.class);

        HelloWorld helloWorld = (HelloWorld) jaxWsProxyFactoryBean.create();
        String result = helloWorld.sayHello("lp", 29);
        System.out.println(result);
    }
}
