// Current time

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds / 1000;
        long totalMinutes = totalSeconds / 60;
        long totalHours = totalMinutes / 60;

        long remainingHours = totalHours % 24;
        long remainingMinutes = totalMinutes % 60;
        long remainingSeconds = totalSeconds % 60;

        long correctedHours = remainingHours + offset;

        System.out.println("The current time is " + correctedHours + ":" + remainingMinutes + ":" + remainingSeconds);
    }
}
