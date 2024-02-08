// Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class CircularSectorAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, a, area, pi = 3.14;

        System.out.print("\nEnter The Radius Of The Circle : ");
        r = input.nextDouble();
        System.out.print("Enter The Measure Of The Central Angle : ");
        a = input.nextDouble();

        area = ((pi * (r * r) * a) / 360);

        System.out.println("\nCircular Sector Area : " + area);

    }

}