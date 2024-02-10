// Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, tempNumber, value, powerValue;
        int powerCount = 0, result = 0;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            tempNumber = userNumber;

            while (tempNumber != 0) {
                tempNumber /= 10;
                powerCount++;
            }

            tempNumber = userNumber;

            while (tempNumber != 0) {
                value = tempNumber % 10;
                powerValue = 1;

                for (int i = 1; i <= powerCount; i++) {
                    powerValue *= value;
                }

                result += powerValue;
                tempNumber /= 10;
            }

            if (result == userNumber) {
                System.out.println("\n" + userNumber + " Is An Armstrong Number.");
            } else {
                System.out.println("\n" + userNumber + " Is Not An Armstrong Number.");
            }

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}