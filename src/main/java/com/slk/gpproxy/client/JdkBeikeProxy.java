package com.slk.gpproxy.client;

import com.slk.gpproxy.Iproxy.GPClassLoader;
import com.slk.gpproxy.Iproxy.GPInvocationHandler;
import com.slk.gpproxy.Iproxy.GPProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkBeikeProxy implements GPInvocationHandler {

    private IHouse target;

    public Object getInstance(IHouse target){
        this.target=target;
        Class<?> clazz=target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj=method.invoke(this.target,args);
        after();
        return obj;
    }

    private void after() {
        System.out.println("付首付，开始卖房");
    }

    private void before() {
        System.out.println("代理看房");
    }
}
