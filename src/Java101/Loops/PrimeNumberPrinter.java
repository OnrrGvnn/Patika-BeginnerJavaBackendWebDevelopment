// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

package Java101.Loops;

public class PrimeNumberPrinter {
    public static void main(String[] args) {

        int counter = 0;

        System.out.println("\nPrime Numbers Between 1 And 100 :\n");

        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                    break;
                }
            }

            if (counter == 0) {
                System.out.print(i + " ");
            }

            counter = 0;

        }

        System.out.println();

    }

}