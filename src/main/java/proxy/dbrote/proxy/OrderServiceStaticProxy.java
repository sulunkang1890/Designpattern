package proxy.dbrote.proxy;

import proxy.dbrote.IOrederService;
import proxy.dbrote.Order;
import proxy.dbrote.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrederService {
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrederService orederService;

    public  OrderServiceStaticProxy(IOrederService orederService){
        this.orederService=orederService;
    }

    public int createOreder(Order order) {
        //先进行分库
        Long time = order.getCreateTime();
        System.out.println(order.getCreateTime());
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" +  dbRouter + "】数据源处理数据" );
        DynamicDataSourceEntity.set(dbRouter);
        this.orederService.createOreder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }
}
