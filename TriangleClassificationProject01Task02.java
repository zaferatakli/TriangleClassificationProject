package task2;

import java.util.Scanner;

public class TriangleClassificationProject01Task02 {
    public static void main(String[] args) {
        /*Triangle Classification Project */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter the length of the second side of the triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter the length of the third side of the triangle:");
        int side3 = input.nextInt();

        if ((side1 + side2 > side3) && (side3 > Math.abs(side1 - side2))) {
            System.out.println("Gecerli Ucgen!");
            if (side1 == side2 && side2 == side3) {
                System.out.println("Eskenar Ucgen!");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Ikizkenar Ucgen!");
            } else {
                System.out.println("Cesit Kenar Ucgen!");
            }
        } else {
            System.out.println("Gecersiz Ucgen!");
        }

    }
}
