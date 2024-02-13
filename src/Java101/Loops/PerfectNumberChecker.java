/* Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.*/

package Java101.Loops;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        int total = 0;

        System.out.print("\nEnter A Number : ");
        userNumber = input.nextInt();

        if (userNumber > 0) {
            for (int i = 1; i < userNumber; i++) {
                if ((userNumber % i == 0)) {
                    total += i;
                }

            }

            if (userNumber == 1) {
                System.out.println("\n" + userNumber + " Is Not A Perfect Number.");
            } else if (userNumber == total) {
                System.out.println("\n" + total + " Is A Perfect Number.");
            } else {
                System.out.println("\n" + total + " Is Not A Perfect Number.");
            }

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}