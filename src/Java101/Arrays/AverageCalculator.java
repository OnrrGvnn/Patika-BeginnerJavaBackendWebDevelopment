package Java101.Arrays;

public class AverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        double avg = 0.0;

        for (int i : numbers) {
            sum += i;
        }

        avg = (double) sum / numbers.length;

        System.out.println("\nAverage : " + avg);

    }

}