package solid.ex04.src;

public class Configs {
    public static PaymentService paymentService = new UPIPaymentService();
    public static Payment payment = new UPIPayment(499);
}
