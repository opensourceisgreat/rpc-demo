package org.liang.demo.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liang
 * Date 2020/12/27-15:10
 */
public class ApiTest {

    public static void main(String[] args) {
        String[] configs = {"liang-rpc-consumer.xml", "liang-rpc-provider.xml"};
        new ClassPathXmlApplicationContext(configs);
    }
}
