// Geometry: area of a hexagon

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = side * side * 3 * Math.pow(3, 0.5) / 2.0;

        System.out.println("The area of the hexagon is " + area);
    }
}
