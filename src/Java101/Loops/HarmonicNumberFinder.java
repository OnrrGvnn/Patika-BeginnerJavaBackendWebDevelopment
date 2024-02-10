// Java ile girilen sayının harmonik serisini bulan program yazacağız.

package Java101.Loops;

import java.util.Scanner;

public class HarmonicNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        double total = 0;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                total += (double) 1 / i;
            }

            System.out.println("\nTotal : " + total);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}