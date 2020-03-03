package com.slk.single.register;

import java.util.HashMap;

/**容器式单例*/
public class ContainerSingleton {
    private ContainerSingleton(){};

    private static HashMap<String,Object> ioc=new HashMap<String, Object>();

    /**容器式单例采用 双重锁的方法可以避免线程不全*/
    public Object getInstance(String className){
            if(!ioc.containsKey(className)){
                    synchronized (this){
                        if(!ioc.containsKey(className)){
                            try {
                                Object instance=Class.forName(className).newInstance();
                                ioc.put(className,instance);
                            }catch (Exception e){
                                e.printStackTrace();
                            }
                        }
                    }
            }
            return ioc.get(className);
    }
}
