// Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height, weight, bmi;

        System.out.print("\nPlease Enter Your Height (in meters) : ");
        height = input.nextDouble();
        System.out.print("Please Enter Your Weight (in kg) : ");
        weight = input.nextDouble();

        bmi = (weight / (height * height));

        System.out.println("\nYour Body Mass Index : " + bmi);

    }

}