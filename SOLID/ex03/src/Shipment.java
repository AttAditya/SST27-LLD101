abstract public class Shipment {
    private ShipmentType type;
    private double weightKg;

    public Shipment(ShipmentType type, double w) {
        this.type = type;
        this.weightKg = w;
    }

    public ShipmentType getType() {
        return this.type;
    }

    public double getWeight() {
        return this.weightKg;
    }
}

