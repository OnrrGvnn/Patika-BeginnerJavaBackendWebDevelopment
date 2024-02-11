// Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class StarTrianglePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nHow Many Layers Of Stars? : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber >= 0) {
            for (int i = 0; i <= userNumber; i++) {
                for (int j = 0; j < (userNumber - i); j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }

                System.out.println(" ");

            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}