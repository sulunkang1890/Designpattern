package proxy.dbrote;

import proxy.dbrote.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Porxydbtest {
    public static void main(String[] args) {
        try {
           Order order = new Order();
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
           Date date = sdf.parse("2017/02/01");
           order.setCreateTime(date.getTime());
           OrderServiceStaticProxy orderServiceProxy=new OrderServiceStaticProxy(new OrderService());
           orderServiceProxy.createOreder(order);
       } catch (ParseException e) {
           e.printStackTrace();
       } finally {
       }

    }
}
