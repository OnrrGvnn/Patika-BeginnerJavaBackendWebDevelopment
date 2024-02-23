package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbersFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(list);

        int number;
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        System.out.print("\nEnter A Number : ");
        number = input.nextInt();

        for (int i : list) {
            if (i < number && i > closestSmaller) {
                closestSmaller = i;
            }

            if (i > number && i < closestLarger) {
                closestLarger = i;
            }
        }

        System.out.println("\nClosest Number Smaller Than The " + number + " : " + closestSmaller);
        System.out.println("Closest Number Larger Than The " + number + " : " + closestLarger);

    }

}