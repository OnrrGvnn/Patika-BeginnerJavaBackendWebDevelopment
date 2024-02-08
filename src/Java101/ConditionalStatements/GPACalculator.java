/* Java ile Matematik, Fizik, Türkçe, Kimya, Müzik derslerinin ,sınav puanlarını kullanıcıdan alan ve ortalamalarını
hesaplayıp ekrana bastırılan programı yazın.Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 55'den
büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın. Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

package Java101.ConditionalStatements;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, physic, turkish, chem, music, lessonCount = 5;
        double avg;

        System.out.print("\nPlease Enter The Math Grade : ");
        mat = input.nextInt();
        System.out.print("Please Enter The Physics Grade : ");
        physic = input.nextInt();
        System.out.print("Please Enter The Turkish Grade : ");
        turkish = input.nextInt();
        System.out.print("Please Enter The Chemistry Grade : ");
        chem = input.nextInt();
        System.out.print("Please Enter The Music Grade : ");
        music = input.nextInt();

        if (mat < 0 || mat > 100) {
            mat = 0;
            lessonCount--;
        }

        if (physic < 0 || physic > 100) {
            physic = 0;
            lessonCount--;
        }

        if (turkish < 0 || turkish > 100) {
            turkish = 0;
            lessonCount--;
        }

        if (chem < 0 || chem > 100) {
            chem = 0;
            lessonCount--;
        }

        if (music < 0 || music > 100) {
            music = 0;
            lessonCount--;
        }

        avg = (double) (mat + physic + turkish + chem + music) / lessonCount;

        System.out.println("\nAverage : " + avg + "\n");

        if (avg >= 55) {
            System.out.println("Congratulations! You Have Passed The Class.");
        } else {
            System.out.println("We're Sorry. You Have Failed The Class.");
        }

    }

}