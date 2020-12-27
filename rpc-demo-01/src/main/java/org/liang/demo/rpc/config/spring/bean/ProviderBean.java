package org.liang.demo.rpc.config.spring.bean;

import org.liang.demo.rpc.config.ProviderConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author liang
 * Date 2020/12/27-13:51
 */
public class ProviderBean extends ProviderConfig implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //发布生产者
        doExport();
    }

}
