package com.slk.gpproxy.client;

import com.slk.gpproxy.Iproxy.GPProxy;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JDKtest {
    public static void main(String[] args) {
        JdkBeikeProxy proxy=new JdkBeikeProxy();
        IHouse house= (IHouse) proxy.getInstance(new ChongqingHouse());
        house.saleHouse();


    }
}
