// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class PowerOfTwoPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            System.out.print("\nPowers Of Two : ");

            for (int i = 1; i <= userNumber; i *= 2) {
                System.out.print(i + " ");
            }

            System.out.println();

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}