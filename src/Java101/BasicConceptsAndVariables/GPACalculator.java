/* Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin ,sınav puanlarını kullanıcıdan alan ve ortalamalarını
hesaplayıp ekrana bastırılan programı yazın.Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan
büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın. Not : If ve Else kullanılmayacak...  */

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, physic, chem, turkish, hist, music;

        System.out.println();
        System.out.print("Please Enter The Math Grade : ");
        mat = input.nextInt();
        System.out.print("Please Enter The Physics Grade : ");
        physic = input.nextInt();
        System.out.print("Please Enter The Chemistry Grade : ");
        chem = input.nextInt();
        System.out.print("Please Enter The Turkish Grade : ");
        turkish = input.nextInt();
        System.out.print("Please Enter The History Grade : ");
        hist = input.nextInt();
        System.out.print("Please Enter The Music Grade : ");
        music = input.nextInt();

        double avg = (double) (mat + physic + chem + turkish + hist + music) / 6;

        System.out.println();
        System.out.println("Average : " + avg);

        String pass = avg >= 60 ? "Congratulations! You Have Passed The Class." : "We're Sorry. You Have Failed The Class.";

        System.out.println(pass);
        
    }

}
