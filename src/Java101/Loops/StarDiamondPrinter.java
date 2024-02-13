// Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

package Java101.Loops;

import java.util.Scanner;

public class StarDiamondPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nHow Many Layers Of Stars? : ");
        userNumber = input.nextInt();
        System.out.println();

        if (userNumber > 0) {
            for (int i = 0; i <= userNumber; i++) {
                for (int j = 1; j <= userNumber - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= ((2 * i) + 1); k++) {
                    System.out.print("*");
                }

                System.out.println();

            }

            for (int i = 0; i < userNumber; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= ((2 * (userNumber - i) - 1)); k++) {
                    System.out.print("*");
                }

                System.out.println();

            }
        } else {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        }

    }

}