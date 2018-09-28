package problems;

public class ItemCreator {
    public static void main(String[] args) {
        RetailItem numberOne = new RetailItem("Jacket", 12, 59.95);
        RetailItem numberTwo = new RetailItem("Jeans", 40, 34.95);
        RetailItem numberThree = new RetailItem("Shirt", 20, 24.95);

        System.out.println("\t\t\tDescription\t\t\tUnits On Hand\t\tPrice");
        System.out.println("Item #1\t\t" + numberOne);
        System.out.println("Item #2\t\t" + numberTwo);
        System.out.println("Item #3\t\t" + numberThree);
    }
}
