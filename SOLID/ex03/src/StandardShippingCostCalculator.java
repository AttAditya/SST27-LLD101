package solid.ex03.src;

public class StandardShippingCostCalculator extends ShippingCostCalculator {
    public StandardShippingCostCalculator() {
        super(50, 5);
    }

    @Override
    public boolean isValidShipment(Shipment s) {
        return s.getType().equals(ShipmentType.STANDARD);
    }
}
