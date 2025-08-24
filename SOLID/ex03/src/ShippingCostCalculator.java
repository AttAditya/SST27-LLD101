abstract public class ShippingCostCalculator {
    private int baseFare;
    private int perKgPrice;

    public ShippingCostCalculator(int baseFare, int perKgPrice) {
        this.baseFare = baseFare;
        this.perKgPrice = perKgPrice;
    }

    abstract public boolean isValidShipment(Shipment s);

    public double cost(Shipment s) {
        if (isValidShipment(s))
            return this.baseFare + (this.perKgPrice * s.getWeight());
            
        throw new IllegalArgumentException(
            "Unknown type: " + s.getType().toString()
        );
    }
}
