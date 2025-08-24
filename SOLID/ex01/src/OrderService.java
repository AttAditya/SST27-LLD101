package SOLID.ex01.src;

public class OrderService {
    private CommunicationClient communicationClient = Configs.client;
    private TaxUtil taxUtil = Configs.taxUtil;

    public void checkout(String customerEmail, double subtotal) {
        double total = taxUtil.totalWithTax(subtotal);
        communicationClient.send(
            customerEmail,
            "Thanks! Your total is " + total
        );
        
        System.out.println("Order stored (pretend DB).");
    }
}
