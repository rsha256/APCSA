package problems;

public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItem() {
        description = "";
    }

    public RetailItem(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    @Override
    public String toString() {
        return description + "\t\t\t\t" + unitsOnHand + "\t\t\t\t\t" + price;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
}
