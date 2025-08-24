public class TaxUtil {
    private double taxRate = 0.18;

    public double totalWithTax(double subtotal) {
        return subtotal + subtotal * taxRate;
    }
}
