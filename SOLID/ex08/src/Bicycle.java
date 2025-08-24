package solid.ex08.src;

public class Bicycle implements PedalVehicle {
    public void pedal(int effort) {
        System.out.println("Pedal effort " + effort);
    }
}
