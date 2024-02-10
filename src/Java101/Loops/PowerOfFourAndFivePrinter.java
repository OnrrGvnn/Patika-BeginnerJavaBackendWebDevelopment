// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class PowerOfFourAndFivePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            System.out.print("\nPowers Of Four : ");

            for (int i = 1; i <= userNumber; i *= 4) {
                System.out.print(i + " ");
            }

            System.out.print("\nPowers Of Five : ");

            for (int i = 1; i <= userNumber; i *= 5) {
                System.out.print(i + " ");
            }

            System.out.println();

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}