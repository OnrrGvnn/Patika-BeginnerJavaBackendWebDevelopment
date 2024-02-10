// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

package Java101.Loops;

import java.util.Scanner;

public class ThreeAndFourAverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber, total = 0;
        double numberCount = 0, average;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber >= 0) {
            for (int i = 0; i <= userNumber; i++) {
                if ((i % 3 == 0) && (i % 4 == 0)) {
                    System.out.print(i + " ");
                    total += i;
                    numberCount++;
                }
            }

            average = (total / numberCount);

            System.out.println("\nAverage : " + average);

        } else {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        }

    }

}