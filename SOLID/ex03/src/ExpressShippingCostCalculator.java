package solid.ex03.src;

public class ExpressShippingCostCalculator extends ShippingCostCalculator {
    public ExpressShippingCostCalculator() {
        super(80, 8);
    }

    @Override
    public boolean isValidShipment(Shipment s) {
        return s.getType().equals(ShipmentType.EXPRESS);
    }
}
