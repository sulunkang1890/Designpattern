package com.slk.single.register;

import java.util.concurrent.ConcurrentHashMap;
/**容器式单例*/
public class ContainerSingletonTwo {
    private ContainerSingletonTwo(){}
    /**通过采用线程安全容器 防止并发产生的安全问题*/
    private static ConcurrentHashMap<String, Object> ioc=new ConcurrentHashMap();

    public Object getInstanc(String className){
        if(!ioc.contains(className)){
           try {
               Object instance=Class.forName(className).newInstance();
               ioc.put(className,instance);
           }catch (Exception e){
               e.printStackTrace();
           }
        }
        return ioc.get(className);
    }
}
