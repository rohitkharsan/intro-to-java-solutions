// Compute the volume of a cylinder

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        final double PI = 3.141592653;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
