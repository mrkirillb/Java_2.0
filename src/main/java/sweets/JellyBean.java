package sweets;

public class JellyBean extends Candies {
    private String color;

    public JellyBean(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lollipop [" + super.toString() + ", color: " + color + "]";
    }
}