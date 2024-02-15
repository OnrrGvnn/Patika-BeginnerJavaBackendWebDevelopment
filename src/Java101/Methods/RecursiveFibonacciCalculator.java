// Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.

package Java101.Methods;

import java.util.Scanner;

public class RecursiveFibonacciCalculator {
    static int fibonacci(int num) {
        if (num == 1 || num == 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNumber;

        System.out.print("\nEnter The Number Of Elements In The Fibonacci Series : ");
        userNumber = input.nextInt();
        System.out.println();

        for (int i = 1; i <= userNumber; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();

    }

}