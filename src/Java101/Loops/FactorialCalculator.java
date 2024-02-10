// Java ile faktöriyel hesaplayan program yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, total = 1;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i++) {
                total *= i;
            }

            System.out.println("\n" + userNumber + "! = " + total);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}