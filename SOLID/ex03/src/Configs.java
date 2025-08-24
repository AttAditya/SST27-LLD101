package SOLID.ex03.src;

public class Configs {
    public static Shipment shipment = new ExpressShipment(2.0);
    public static ShippingCostCalculator calculator
        = new ExpressShippingCostCalculator();
}
