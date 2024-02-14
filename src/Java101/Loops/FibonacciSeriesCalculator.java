// Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

package Java101.Loops;

import java.util.Scanner;

public class FibonacciSeriesCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;
        int number1 = 0, number2 = 1, nextNumber;

        System.out.print("\nEnter The Number Of Elements In The Fibonacci Series : ");
        userNumber = input.nextInt();

        if (userNumber <= 0) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } else if (userNumber == 1) {
            System.out.println("\n" + number1);
        } else {
            System.out.print("\n" + number1 + " " + number2 + " ");

            for (int i = 1; i <= (userNumber - 2); i++) {
                nextNumber = number1 + number2;
                System.out.print(nextNumber + " ");
                number1 = number2;
                number2 = nextNumber;
            }

            System.out.println();

        }

    }

}