// Science: calculating energy

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double massOfWater = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();

        double energyNeeded = massOfWater * 4184 * (finalTemperature - initialTemperature);

        System.out.println("The energy needed is " + energyNeeded);
    }
}
