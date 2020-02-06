package proxy.dbrote;

public class OrderService implements  IOderService{
    private OrderDao orderDao;

    public OrderService(){
        this.orderDao=new OrderDao();
    }
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }


}
