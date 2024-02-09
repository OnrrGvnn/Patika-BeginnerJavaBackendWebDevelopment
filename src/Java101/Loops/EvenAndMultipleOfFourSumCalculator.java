/* Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz. */

package Java101.Loops;

import java.util.Scanner;

public class EvenAndMultipleOfFourSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, total = 0;

        System.out.println();

        do {
            System.out.print("Please Enter A Number : ");
            userNumber = input.nextInt();

            if (userNumber % 4 == 0) {
                total += userNumber;
            }

        } while (userNumber % 2 == 0);

        System.out.println("\nTotal : " + total);

    }

}