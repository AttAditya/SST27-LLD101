package solid.ex09.src;

public class Configs {
    public static OrderRepository orderRepository = new SqlOrderRepository();
    public static OrderController orderController = new OrderController(
        Configs.orderRepository
    );
}
