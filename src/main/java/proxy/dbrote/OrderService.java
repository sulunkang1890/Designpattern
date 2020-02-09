package proxy.dbrote;

public class OrderService implements IOrederService{
    private OrderDao orderDao;

    public OrderService(){
        this.orderDao=new OrderDao();
    }
    public int createOreder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        this.orderDao.insert(order);
        return 0;
    }
}
