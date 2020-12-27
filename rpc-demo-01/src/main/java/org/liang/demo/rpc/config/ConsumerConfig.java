package org.liang.demo.rpc.config;

/**
 * @author liang
 * Date 2020/12/18-20:40
 */
public class ConsumerConfig<T> {

    private String nozzle; //接口
    private String alias;  //别名

    //动态代理链接
    protected synchronized T refer() {

        System.out.format("消费者信息=> [接口：%s] [别名：%s] \r\n", nozzle, alias);

        return null;
    }

    public String getNozzle() {
        return nozzle;
    }

    public void setNozzle(String nozzle) {
        this.nozzle = nozzle;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
