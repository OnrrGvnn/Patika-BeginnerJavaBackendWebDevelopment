// Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

package Java101.Methods;

import java.util.Scanner;

public class RecursiveExponentCalculator {

    static int exponent(int base, int exp) {
        if (exp < 0) {
            return -1;
        } else if (exp == 0) {
            return 1;
        } else {
            return base * exponent(base, exp - 1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base, exponent, result;

        System.out.print("\nEnter The Base Value : ");
        base = input.nextInt();
        System.out.print("Enter The Exponent Value : ");
        exponent = input.nextInt();

        result = exponent(base, exponent);

        if (result == -1) {
            System.out.println("\nExponent Value Cannot Be Less Than 0!");
        } else {
            System.out.println("\nResult : " + result);

        }

    }

}