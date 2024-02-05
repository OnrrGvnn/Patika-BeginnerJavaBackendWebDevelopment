/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km, perKm = 2.20, startPrice = 10, price, total;

        System.out.println();
        System.out.print("Enter The Distance Traveled In Kilometers : ");
        km = input.nextDouble();

        price = startPrice + (km * perKm);

        total = (price <= 20) ? 20 : price;

        System.out.println();
        System.out.println("Taximeter Price : " + total);

    }

}
