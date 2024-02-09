// Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class EvenNumbersFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nPlease Enter A Number : ");
        userNumber = input.nextInt();
        System.out.println();

        for (int i = 1; i <= userNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }

}