// Financial application: monetary units

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in cents as integer: ");
        int amount = input.nextInt();
        int initialAmount = amount;

        int numberOfDollars = amount / 100;
        amount = amount % 100;

        int numberOfQuarters = amount / 25;
        amount = amount % 25;

        int numberOfDimes = amount / 10;
        amount = amount % 10;

        int numberOfNickels = amount / 5;
        amount = amount % 5;

        int numberOfPennies = amount;

        System.out.println("Your amount " + initialAmount + " consists of");
        System.out.println("          " + numberOfDollars + " dollars");
        System.out.println("          " + numberOfQuarters + " quarters");
        System.out.println("          " + numberOfDimes + " dimes");
        System.out.println("          " + numberOfNickels + " nickels");
        System.out.println("          " + numberOfPennies + " pennies");
    }
}
