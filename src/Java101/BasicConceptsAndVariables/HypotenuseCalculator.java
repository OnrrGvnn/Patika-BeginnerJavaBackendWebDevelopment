/*  Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.  */

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side1, side2;
        double hypo;

        System.out.println();
        System.out.print("Enter The First Side Of The Triangle : ");
        side1 = input.nextInt();
        System.out.print("Enter The Second Side Of The Triangle : ");
        side2 = input.nextInt();

        hypo = Math.sqrt((side1 * side1) + (side2 * side2));
        System.out.println();
        System.out.println("Hypotenuse : " + hypo);

    }

}
