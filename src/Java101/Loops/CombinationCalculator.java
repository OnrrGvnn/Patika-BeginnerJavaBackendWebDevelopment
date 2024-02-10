// Java ile kombinasyon hesaplayan program yazınız.

package Java101.Loops;

import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, r, combination;
        int nTotal = 1, rTotal = 1, mixTotal = 1;

        System.out.print("\nEnter The Value Of n : ");
        n = input.nextInt();
        System.out.print("Enter The Value Of r : ");
        r = input.nextInt();

        if (n >= 0 && r >= 0) {
            if (n >= r) {
                for (int i = 1; i <= n; i++) {
                    nTotal *= i;
                }

                for (int i = 1; i <= r; i++) {
                    rTotal *= i;
                }

                for (int i = 1; i <= (n - r); i++) {
                    mixTotal *= i;
                }

                if ((r == 0)) {
                    combination = 1;
                } else {
                    combination = (nTotal / (rTotal * mixTotal));
                }

                System.out.println("\nC(" + n + "," + r + ") = " + combination);

            } else {
                System.out.println("\nError! n Should Be Greater Than Or Equal To r.");
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}