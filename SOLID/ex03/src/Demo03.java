public class Demo03 {
    public static void main(String[] args) {
        Shipment shipment = Configs.shipment;
        ShippingCostCalculator calculator = Configs.calculator;
        
        System.out.println(calculator.cost(shipment));
    }
}
