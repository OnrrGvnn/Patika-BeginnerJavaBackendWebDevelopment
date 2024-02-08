// Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class CircleAreaAndCircumferenceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, pi = 3.14, area, circumference;

        System.out.print("\nEnter The Radius Of The Circle : ");
        r = input.nextDouble();

        area = (pi * (r * r));
        circumference = (2 * pi * r);

        System.out.println("\nCircle Area : " + area);
        System.out.println("Circle Circumference : " + circumference);

    }

}