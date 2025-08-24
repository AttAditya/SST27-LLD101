package solid.ex01.src;

public class Demo01 {
    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.checkout(
            "a@shop.com",
            100.0
        );
    }
}

