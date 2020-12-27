package org.liang.demo.rpc.config.spring.bean;

import org.liang.demo.rpc.config.ServerConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author liang
 * Date 2020/12/27-13:52
 */
public class ServerBean extends ServerConfig implements InitializingBean, ApplicationContextAware {
    private transient ApplicationContext applicationContext;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.format("服务端信息=> [注册中心地址：%s] [注册中心端口：%s] \r\n", host, port);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
