package cn.zephyr.patterns.proxy.dynamic;

import cn.zephyr.patterns.proxy.entity.Children;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

    private Children target;

    public Object getInstance(Children target){
        this.target = target;
        Class<? extends Children> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("JDK代理类代办开始……");
        method.invoke(proxy, args);
        System.err.println("JDK代理类代办结束……");
        return null;
    }
}
