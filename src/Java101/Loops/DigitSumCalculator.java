// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

package Java101.Loops;

import java.util.Scanner;

public class DigitSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, tempNumber, value;
        int total = 0;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            tempNumber = userNumber;

            while (tempNumber != 0) {
                value = tempNumber % 10;
                total += value;
                tempNumber /= 10;
            }

            System.out.println("\nThe Sum Of Digits In " + userNumber + " is : " + total);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}