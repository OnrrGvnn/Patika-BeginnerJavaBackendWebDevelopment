// Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

package Java101.Methods;

import java.util.Scanner;

public class RecursivePrimeChecker {
    static boolean isPrime(int n, int d) {
        if (d == 1) {
            return true;
        }

        if (n % d == 0) {
            return false;
        }

        return isPrime(n, d - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("\nEnter A Number : ");
        number = input.nextInt();

        if (number <= 0) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } else if (number == 1) {
            System.out.println("\n" + number + " Is Not A Prime Number !");
        } else if (isPrime(number, number / 2)) {
            System.out.println("\n" + number + " Is A Prime Number !");
        } else {
            System.out.println("\n" + number + " Is Not A Prime Number !");
        }

    }

}