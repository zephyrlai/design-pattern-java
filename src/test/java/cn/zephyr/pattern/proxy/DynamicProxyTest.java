package cn.zephyr.pattern.proxy;

import cn.zephyr.patterns.proxy.dynamic.CglibProxy;
import cn.zephyr.patterns.proxy.entity.Children;
import org.junit.Test;

public class DynamicProxyTest {

    @Test
    public void CglibDynTest(){
        Children instance = (Children)CglibProxy.getInstance(Children.class);
        System.err.println("代理类为:"+instance.getClass());
        instance.play();
    }
}
