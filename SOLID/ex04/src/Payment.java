package solid.ex04.src;

abstract public class Payment {
    private String provider;
    private double amount;
    
    public Payment(String p, double a) {
        this.provider = p;
        this.amount = a;
    }

    public String getProvider() {
        return this.provider;
    }

    public double getAmount() {
        return this.amount;
    }
}
