package Java101.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] list = {5, 4, 633, 441, 3, 66, -9, -77, 15};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }
        }

        System.out.println("\nMax Value : " + max);
        System.out.println("Min Value : " + min);

    }

}