package org.liang.demo.test.service.impl;

import org.liang.demo.test.service.HelloService;

/**
 * @author liang
 * Date 2020/12/27-15:11
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void echo() {
        System.out.println("hi liang demo rpc");
    }
}
