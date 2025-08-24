package solid.ex04.src;

public class CardPaymentService implements PaymentService {
    @Override
    public String pay(Payment payment) {
        if (payment.getProvider().equals("CARD"))
            return "Charged card: " + payment.getAmount();

        throw new RuntimeException(
            "Invalid provider: " + payment.getProvider()
        );
    }
}
