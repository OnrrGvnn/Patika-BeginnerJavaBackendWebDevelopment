/* Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.*/

package Java101.Methods;

import java.util.Scanner;

public class RecursivePattern {
    public static void recursiveMethod(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        recursiveMethod(n - 5);

        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("\nEnter A Number : ");
        number = input.nextInt();
        System.out.println();

        if (number <= 0) {
            System.out.print("You Made An Invalid Entry. Please Try Again!");
        } else {
            recursiveMethod(number);
        }

        System.out.println();

    }
}