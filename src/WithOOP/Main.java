package task2.src.WithOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Triangle Classification Project */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first edge length of the triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter the second edge length of the triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter the third edge length of the triangle: ");
        int side3 = input.nextInt();

        Triangle triangle = new Triangle(side1, side2, side3);

        System.out.println(triangle.classifyTriangle());
        input.close();
    }
}
