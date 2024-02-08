/* Hava sıcaklığına göre etkinlik öneren programı yazının. Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */

package Java101.ConditionalStatements;

import java.util.Scanner;

public class TemperatureActivityRecommendation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature;

        System.out.print("\nPlease Enter The Air Temperature : ");
        temperature = input.nextInt();

        if (temperature < 5) {
            System.out.print("\nYou Can Go Skiing.\n");
        } else if (temperature <= 15) {
            System.out.print("\nYou Can Go To The Cinema.\n");
        } else if (temperature <= 25) {
            System.out.print("\nYou Can Go On A Picnic.\n");
        } else {
            System.out.print("\nYou Can Go Swimming.\n");
        }

    }

}