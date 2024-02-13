// Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

package Java101.Loops;

import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count, number;
        int i = 1, max = 0, min = 0;

        System.out.print("\nHow Many Numbers Will You Enter? : ");
        count = input.nextInt();
        System.out.println();

        if (count > 0) {
            while (i <= count) {
                System.out.print(i + ". Number : ");
                number = input.nextInt();

                if (i == 1) {
                    max = number;
                    min = number;
                } else {
                    if (number > max) {
                        max = number;
                    }

                    if (number < min) {
                        min = number;
                    }

                }

                i++;

            }

            System.out.println("\nMax : " + max);
            System.out.println("Min : " + min);

        }

    }

}