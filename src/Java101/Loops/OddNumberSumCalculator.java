/* Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen
değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz. */

package Java101.Loops;

import java.util.Scanner;

public class OddNumberSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, total = 0;

        System.out.println();

        do {
            System.out.print("Please Enter A Number : ");
            userNumber = input.nextInt();

            if (userNumber % 2 == 1) {
                total += userNumber;
            }
        } while (userNumber > 0);

        System.out.println("\nTotal : " + total);

    }

}