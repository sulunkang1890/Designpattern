package proxy.JDKproxy;

import proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKMeipo implements InvocationHandler {
    private Person taget;

    public Object getInstance (Person person) throws Exception{
        this.taget=person;
        Class<?> clzz= taget.getClass();
        return Proxy.newProxyInstance(clzz.getClassLoader(),clzz.getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        this.before();
        Object obj=method.invoke(this.taget,args);
        this.after();
        return obj;
    }
    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
