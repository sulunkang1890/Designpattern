package proxy.dbrote.proxy;

import proxy.dbrote.IOderService;
import proxy.dbrote.Order;
import proxy.dbrote.OrderService;
import proxy.dbrote.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceProxy implements IOderService {

    private IOderService iOderService;

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    public OrderServiceProxy(IOderService iOderService){
        this.iOderService=iOderService;
    }
    public int createOrder(Order order) {

        //数据源切换 换算年份
        Long time = order.getCreateTime();

        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDataSourceEntity.set(dbRouter);
        this.iOderService.createOrder(order);

        return 0;
    }
}
