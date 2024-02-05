/* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.  */

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, kdvPrice, total;

        System.out.println();
        System.out.print("Please Enter The Price : ");
        price = input.nextDouble();

        kdvPrice = (price > 0 && price <= 1000) ? (0.18 * price) : (0.08 * price);
        System.out.println();
        System.out.println("KDV Price : " + kdvPrice);

        total = (price + kdvPrice);
        System.out.println("Total Price : " + total);

    }

}
