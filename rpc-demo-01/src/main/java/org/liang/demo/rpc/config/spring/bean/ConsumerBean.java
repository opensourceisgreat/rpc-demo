package org.liang.demo.rpc.config.spring.bean;

import org.liang.demo.rpc.config.ConsumerConfig;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author liang
 * Date 2020/12/27-13:51
 */
public class ConsumerBean<T> extends ConsumerConfig<T> implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return refer();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
