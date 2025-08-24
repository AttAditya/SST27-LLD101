package solid.ex09.src;

public class Demo09 {
    public static void main(String[] args) {
        OrderController orderController = Configs.orderController;
        orderController.create("ORD-1");
    }
}
