// Population projection

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        // 0.5 added to round up
        int finalPopulation = (int)(312032486 + 0.5 + years * (365 * 24 * 3600 * (1.0 / 7 - 1.0 / 13 + 1.0 / 45)));

        System.out.println("The population in " + years + " years is " + finalPopulation);
    }
}
