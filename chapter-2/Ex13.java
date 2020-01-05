// Financial application: compound value

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        final double MONTHLY_RATE = 5.0 / 12.0 / 100.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double amount = input.nextDouble();

        double total = 0;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        total += amount;
        total *= 1 + MONTHLY_RATE;

        System.out.println("After the sixth month, the account value is $" + total);
    }
}
