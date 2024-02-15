// Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

package Java101.Methods;

import java.util.Scanner;

public class PalindromeNumberChecker {

    static void palindromeChecker(int num) {
        int temp = num;
        int lastNumber;
        int reverseNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (num == reverseNumber) {
            System.out.println("\n" + num + " Is A Palindrome Number.");
        } else {
            System.out.println("\n" + num + " Is Not A Palindrome Number.");
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("\nEnter A Number : ");
        number = input.nextInt();

        palindromeChecker(number);

    }
}