// Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.

package Java101.ConditionalStatements;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        System.out.print("\nEnter The Year : ");
        year = input.nextInt();

        if (year > 0) {
            if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
                System.out.println("\n" + year + " Is A Leap Year.");
            } else {
                System.out.println("\n" + year + " Is Not A Leap Year.");
            }
        } else {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}