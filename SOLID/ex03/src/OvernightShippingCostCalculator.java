package solid.ex03.src;

public class OvernightShippingCostCalculator extends ShippingCostCalculator {
    public OvernightShippingCostCalculator() {
        super(120, 10);
    }

    @Override
    public boolean isValidShipment(Shipment s) {
        return s.getType().equals(ShipmentType.OVERNIGHT);
    }
}
