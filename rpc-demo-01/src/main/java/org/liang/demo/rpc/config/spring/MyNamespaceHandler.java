package org.liang.demo.rpc.config.spring;

import org.liang.demo.rpc.config.spring.bean.ConsumerBean;
import org.liang.demo.rpc.config.spring.bean.ProviderBean;
import org.liang.demo.rpc.config.spring.bean.ServerBean;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author liang
 * Date 2020/12/27-13:52
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("consumer", new MyBeanDefinitionParser(ConsumerBean.class));
        registerBeanDefinitionParser("provider", new MyBeanDefinitionParser(ProviderBean.class));
        registerBeanDefinitionParser("server", new MyBeanDefinitionParser(ServerBean.class));
    }
}
