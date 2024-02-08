// Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

package Java101.ConditionalStatements;

import java.time.Year;
import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year, chnZodiac;
        String chnZodiacName = "";
        boolean isError = false;

        System.out.print("\nEnter Your Birth Year: ");
        year = input.nextInt();

        chnZodiac = (year % 12);

        if (year > 0) {
            switch (chnZodiac) {
                case 0:
                    chnZodiacName = "Monkey";
                    break;
                case 1:
                    chnZodiacName = "Rooster";
                    break;
                case 2:
                    chnZodiacName = "Dog";
                    break;
                case 3:
                    chnZodiacName = "Pig";
                    break;
                case 4:
                    chnZodiacName = "Rat";
                    break;
                case 5:
                    chnZodiacName = "Ox";
                    break;
                case 6:
                    chnZodiacName = "Tiger";
                    break;
                case 7:
                    chnZodiacName = "Rabbit";
                    break;
                case 8:
                    chnZodiacName = "Dragon";
                    break;
                case 9:
                    chnZodiacName = "Snake";
                    break;
                case 10:
                    chnZodiacName = "Horse";
                    break;
                case 11:
                    chnZodiacName = "Goat";
                    break;
                default:
                    isError = true;
                    break;
            }

            System.out.println("\nYour Chinese Zodiac Sign: " + chnZodiacName);

        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        }

    }

}