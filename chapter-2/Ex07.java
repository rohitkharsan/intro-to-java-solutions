// Find the number of years

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int totalDays = minutes / (24 * 60);
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        System.out.println(minutes + " minutes is approximately " + years + " and " + remainingDays + " days");
    }
}
