package proxy.JDKproxy;

import proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new JDKMeipo().getInstance(new Girl());
            obj.findlove();


            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
