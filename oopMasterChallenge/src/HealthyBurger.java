public class HealthyBurger extends BaseBurger {
    private String healthyExtraName;
    private double healthyExtraPrice;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyExtra(String name, double price) {
        this.healthyExtraName = name;
        this.healthyExtraPrice = price;

    }
    public void addHealthyExtra2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;

    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice= super.itemizeHamburger();
    }
}
