package com.slk.single.test;

import com.slk.single.register.EnumSignle;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EnumSignleTest {
    @Test
    public  void test(){
        try {
            EnumSignle s2 = EnumSignle.getInstance();
            FileOutputStream fos = new FileOutputStream("EnumSignle.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
