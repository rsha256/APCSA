package PiggyChak;

import java.util.Scanner;

public class PiggyBankScanner {
    public static void main(String[] args) {
        Scanner input = null;
        try {
            input = new Scanner(System.in);

            System.out.println("How many pennies for PiggyBank1?");
            int pennies = input.nextInt();
            System.out.println("How many nickels for PiggyBank1?");
            int nickels = input.nextInt();
            System.out.println("How many dimes for PiggyBank1?");
            int dimes = input.nextInt();
            System.out.println("How many quarters for PiggyBank1?");
            int quarters = input.nextInt();

            PiggyBank p1 = new PiggyBank(pennies, nickels, dimes, quarters);
            System.out.println("Account 1: " + p1 + "\n");

            System.out.println("How many pennies for PiggyBank2?");
            int pennies2 = input.nextInt();
            System.out.println("How many nickels for PiggyBank2?");
            int nickels2 = input.nextInt();
            System.out.println("How many dimes for PiggyBank2?");
            int dimes2 = input.nextInt();
            System.out.println("How many quarters for PiggyBank2?");
            int quarters2 = input.nextInt();

            PiggyBank p2 = new PiggyBank(pennies2, nickels2, dimes2, quarters2);
            System.out.println("Account 2: " + p2 + "\n");

            p1.combinePiggy(p2);

            System.out.println("Account 1: " + p1 + "\n");
            System.out.println("Account 2: " + p2 + "\n");

        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}
