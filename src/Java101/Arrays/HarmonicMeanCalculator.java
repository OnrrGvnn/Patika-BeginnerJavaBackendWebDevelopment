// Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

package Java101.Arrays;

public class HarmonicMeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        double harMean;

        for (double i : numbers) {
            sum += (1 / i);
        }

        harMean = (double) numbers.length / sum;

        System.out.println("\nHarmonic Mean : " + harMean);

    }

}