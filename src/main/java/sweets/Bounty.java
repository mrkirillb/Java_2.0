package sweets;

public class Bounty extends Candies {
    private String origin;

    public Bounty(String name, double price, double weight, String origin) {
        super(name, price, weight);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Bounty [" + super.toString() + ", origin: " + origin + "]";
    }
}