// Sum the digits in an integer

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");
        int number = input.nextInt();

        int sum = 0;

        // Extract and add the last digit, then remove the last digit
        // Do this thrice as number can have a maximum of 3 digits
        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        System.out.println("The sum of the digits is " + sum);
    }
}
