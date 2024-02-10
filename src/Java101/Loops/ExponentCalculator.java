// Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

package Java101.Loops;

import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baseNumber, exponentNumber;
        int total = 1;

        System.out.print("\nEnter The Base Number : ");
        baseNumber = input.nextInt();
        System.out.print("Enter the Exponent Number : ");
        exponentNumber = input.nextInt();

        if (baseNumber >= 0 && exponentNumber >= 0) {
            for (int i = 1; i <= exponentNumber; i++) {
                total *= baseNumber;
            }

            System.out.println("\n" + baseNumber + " ^ " + exponentNumber + " = " + total);

        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}