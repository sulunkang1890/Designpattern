package com.slk.proxy;

import com.slk.gpproxy.Iproxy.GPProxy;
import sun.misc.ProxyGenerator;

import java.io.*;

public class JDKtest {
    public static void main(String[] args) {
//        JdkBeikeProxy proxy=new JdkBeikeProxy();
//        IHouse house= (IHouse) proxy.getInstance(new ChongqingHouse());
//        house.saleHouse();
//        byte[] bytes=ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IHouse.class});
//        try {
//            FileOutputStream os=new FileOutputStream("E://$Proxy0.class");
//            try {
//                os.write(bytes);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        String src = "aaaa";
//           System.out.println(src);
        //2、Java文件输出磁盘
        try{
            String filePath1 = GPProxy.class.getResource("").getPath();
            String filePath="E:/";
//           System.out.println(filePath);
            File f = new File(filePath + "$Proxy0.java");
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
