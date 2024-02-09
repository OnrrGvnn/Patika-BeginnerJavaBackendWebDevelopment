// Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class PowerOfTwoPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber > 0) {
            for (int i = 1; i <= userNumber; i *= 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("You Made A Invalid Entry !");
        }

        System.out.println();

    }

}