package lp;

import lp.service.impl.HelloWorldImpl;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @Author: liangpeng
 * @Date: 2021/5/9 20:47
 */
public class main {

    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress("http://localhost:9999/webservice");
        jaxWsServerFactoryBean.setServiceClass(HelloWorldImpl.class);
        Server s = jaxWsServerFactoryBean.create();
        s.start();
    }
}
