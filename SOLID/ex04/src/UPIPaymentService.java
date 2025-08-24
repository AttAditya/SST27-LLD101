package solid.ex04.src;

public class UPIPaymentService implements PaymentService {
    @Override
    public String pay(Payment payment) {
        if (payment.getProvider().equals("UPI"))
            return "Paid via UPI: " + payment.getAmount();

        throw new RuntimeException(
            "Invalid provider: " + payment.getProvider()
        );
    }
}
