// Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

package Java101.Methods;

import java.util.Scanner;

public class AdvancedCalculator {
    static void addition() {
        Scanner input = new Scanner(System.in);

        int count, number;
        int result = 0;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();
        System.out.println();

        if (count <= 1) {
            System.out.println("You Must Enter A Minimum Of 2 Numbers!");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print(i + ". Number : ");
                number = input.nextInt();
                result += number;
            }

            System.out.println("\nResult : " + result);

        }

    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);

        int count, number;
        int result = 0;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();
        System.out.println();

        if (count <= 0) {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        } else if (count == 1) {
            System.out.println("You Must Enter A Minimum Of 2 Numbers!");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print(i + ". Number : ");
                number = input.nextInt();

                if (i == 1) {
                    result += number;
                    continue;
                }

                result -= number;

            }

            System.out.println("\nResult : " + result);

        }

    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);

        int count, number;
        int result = 1;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();
        System.out.println();

        if (count <= 0) {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        } else if (count == 1) {
            System.out.println("You Must Enter A Minimum Of 2 Numbers!");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print(i + ". Number : ");
                number = input.nextInt();
                result *= number;
            }

            System.out.println("\nResult : " + result);

        }

    }

    static void division() {
        Scanner input = new Scanner(System.in);

        int count;
        double number, result = 0.0;

        System.out.print("\nHow Many Numbers Will You Enter : ");
        count = input.nextInt();
        System.out.println();

        if (count <= 0) {
            System.out.println("You Made An Invalid Entry. Please Try Again!");
        } else if (count == 1) {
            System.out.println("You Must Enter A Minimum Of 2 Numbers!");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print(i + ". Number : ");
                number = input.nextInt();

                if (i != 1 && number == 0) {
                    System.out.println("\nYou Cannot Enter 0 As The Divisor!");
                    continue;
                }

                if (i == 1) {
                    result = number;
                    continue;
                }

                result /= number;

            }

            System.out.println("\nResult : " + result);

        }

    }

    static void exponentiation() {
        Scanner input = new Scanner(System.in);

        int base, exponent;
        int result = 1;

        System.out.print("\nEnter The Base Value : ");
        base = input.nextInt();
        System.out.print("Enter The Exponent Value : ");
        exponent = input.nextInt();

        if (exponent < 0) {
            System.out.println("\nExponent Value Cannot Be Less Than 0!");
        } else if (exponent == 0 || exponent == 1) {
            System.out.println("\nResult : " + result);
        } else {
            for (int i = 1; i <= exponent; i++) {
                if (base == 0) {
                    result = 1;
                }

                result *= base;
            }

            System.out.println("\nResult : " + result);

        }

    }

    static void factorial() {
        Scanner input = new Scanner(System.in);

        int number;
        int result = 1;

        System.out.print("\nEnter A Number : ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } else if (number == 0) {
            System.out.println("\nResult : " + result);
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }

            System.out.println("\nResult : " + result);

        }

    }

    static void mod() {
        Scanner input = new Scanner(System.in);

        int number1, number2, result;

        System.out.print("\nEnter The First Number : ");
        number1 = input.nextInt();
        System.out.print("Enter The Second Number : ");
        number2 = input.nextInt();

        if ((number1 <= 0) || (number2 <= 0)) {
            System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
        } else {
            result = (number1 % number2);
            System.out.println("\nResult : " + result);
        }

    }

    static void rectangleAreaPerimeter() {
        Scanner input = new Scanner(System.in);

        int side1, side2, area, perimeter;

        System.out.print("\nEnter The Short Side Of The Rectangle: : ");
        side1 = input.nextInt();
        System.out.print("Enter The Long Side Of The Rectangle : ");
        side2 = input.nextInt();

        area = (side1 * side2);
        perimeter = ((side1 + side2) * 2);

        System.out.println("\nArea : " + area);
        System.out.print("Perimeter : " + perimeter);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int select;

        while (true) {
            System.out.println("\nHello. Here Are The Types Of Operations You Can Perform :\n");
            System.out.print("""
                    1-Addition Operation\s
                    2-Subtraction Operation\s
                    3-Multiplication Operation\s
                    4-Division Operation\s
                    5-Exponentiation\s
                    6-Factorial Calculation\s
                    7-Modulus Operation\s
                    8-Rectangle Area and Perimeter Calculation\s
                    0-Exit
                    """);
            System.out.print("\nYour Choice : ");
            select = input.nextInt();

            if (select == 0) {
                System.out.println("\nGood Bye !");
                break;
            }

            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleAreaPerimeter();
                    break;
                default:
                    System.out.println("\nYou Made An Invalid Entry. Please Try Again!");
                    break;
            }

        }

    }

}