package solid.ex04.src;

public class WalletPaymentService implements PaymentService {
    @Override
    public String pay(Payment payment) {
        if (payment.getProvider().equals("WALLET"))
            return "Wallet debit: " + payment.getAmount();

        throw new RuntimeException(
            "Invalid provider: " + payment.getProvider()
        );
    }
}
