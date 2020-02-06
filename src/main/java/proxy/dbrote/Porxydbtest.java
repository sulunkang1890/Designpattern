package proxy.dbrote;

import proxy.dbrote.proxy.OrderServiceProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Porxydbtest {
    public static void main(String[] args) {
        try {
            Order order = new Order();

            order.setCreateTime(new Date().getTime());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            OrderServiceProxy orderServiceProxy=new OrderServiceProxy(new OrderService());
            orderServiceProxy.createOrder(order);
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
