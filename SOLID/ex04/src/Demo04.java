package solid.ex04.src;

public class Demo04 {
    public static void main(String[] args) {
        PaymentService paymentService = Configs.paymentService;
        Payment payment = Configs.payment;

        System.out.println(paymentService.pay(payment));
    }
}
