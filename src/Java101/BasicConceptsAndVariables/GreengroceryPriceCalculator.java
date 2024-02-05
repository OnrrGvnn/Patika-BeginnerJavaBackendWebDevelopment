// Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

package Java101.BasicConceptsAndVariables;

import java.util.Scanner;

public class GreengroceryPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pricePear = 2.14, priceApple = 3.67, priceTomato = 1.11, priceBanana = 0.95, priceEggplant = 5, total;
        int numberPear, numberApple, numberTomato, numberBanana, numberEggplant;

        System.out.println();
        System.out.print("Please Enter The Quantity Of Pears You Would Like To Purchase : ");
        numberPear = input.nextInt();
        System.out.print("Please Enter The Quantity Of Apples You Would Like To Purchase : ");
        numberApple = input.nextInt();
        System.out.print("Please Enter The Quantity Of Tomatoes You Would Like To Purchase : ");
        numberTomato = input.nextInt();
        System.out.print("Please Enter The Quantity Of Bananas You Would Like To Purchase : ");
        numberBanana = input.nextInt();
        System.out.print("Please Enter The Quantity Of Eggplants You Would Like To Purchase : ");
        numberEggplant = input.nextInt();

        total = ((pricePear * numberPear) + (priceApple * numberApple) + (priceTomato * numberTomato) + (priceBanana * numberBanana) + (priceEggplant * numberEggplant));

        System.out.println();
        System.out.println("Total Price : " + total);

    }

}