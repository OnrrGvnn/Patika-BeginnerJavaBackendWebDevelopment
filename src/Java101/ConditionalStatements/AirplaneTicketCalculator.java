/* Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi
(Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır. */

package Java101.ConditionalStatements;

import java.util.Scanner;

public class AirplaneTicketCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int km, age, ticketClass;
        double perKm = 0.10, total, ageDiscount1 = 0.50, ageDiscount2 = 0.10, ageDiscount3 = 0.30, classDiscount = 0.20;
        boolean isError = false;

        System.out.print("\nEnter The Distance Traveled In Kilometers : ");
        km = input.nextInt();
        System.out.print("Enter Your Age : ");
        age = input.nextInt();
        System.out.print("Enter The Travel Type (1 => One Way, 2 => Round Trip) : ");
        ticketClass = input.nextInt();

        total = km * perKm;

        if (km > 0) {
            if (age > 0) {
                if (age < 12) {
                    total -= (total * ageDiscount1);
                } else if (age <= 24) {
                    total -= (total * ageDiscount2);
                } else if (age > 65) {
                    total -= (total * ageDiscount3);
                }

                switch (ticketClass) {
                    case 1:
                        System.out.print("\nTotal Amount : " + total + "\n");
                        break;
                    case 2:
                        total = ((total - (total * classDiscount)) * 2);
                        System.out.print("\nTotal Amount : " + total + "\n");
                        break;
                    default:
                        isError = true;
                }

            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("\nYou Made An Invalid Entry. Please Try Again!\n");
        }

    }

}