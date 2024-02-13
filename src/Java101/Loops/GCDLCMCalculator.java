// Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1, number2;
        int i = 1, gcdResult = 1, lcmResult = 1;

        System.out.print("\nEnter The First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        number2 = input.nextInt();

        if ((number1 > 0) && (number2 > 0)) {
            if (number1 <= number2) {
                while (i <= number1) {
                    if ((number1 % i == 0) && (number2 % i == 0)) {
                        gcdResult = i;
                    }

                    i++;

                }

                System.out.println("\nGCD of " + number1 + " and " + number2 + " is : " + gcdResult);

            } else {
                while (i <= number2) {
                    if ((number1 % i == 0) && (number2 % i == 0)) {
                        gcdResult = i;
                    }

                    i++;

                }

                System.out.println("\nGCD of " + number1 + " and " + number2 + " is : " + gcdResult);

            }

            while (i <= (number1 * number2)) {
                if ((i % number1 == 0) && (i % number2 == 0)) {
                    lcmResult = i;
                    break;
                }

                i++;

            }

            System.out.println("LCM of " + number1 + " and " + number2 + " is : " + lcmResult);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}