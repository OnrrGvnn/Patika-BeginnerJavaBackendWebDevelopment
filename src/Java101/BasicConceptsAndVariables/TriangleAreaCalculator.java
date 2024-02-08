/* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız. */

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side1, side2, side3;
        double u, area;

        System.out.print("\nEnter The First Side Of The Triangle : ");
        side1 = input.nextInt();
        System.out.print("Enter The Second Side Of The Triangle : ");
        side2 = input.nextInt();
        System.out.print("Enter The Third Side Of The Triangle : ");
        side3 = input.nextInt();

        u = (double) (side1 + side2 + side3) / 2;
        area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.println("\nTriangle Area : " + area);

    }

}