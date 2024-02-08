/* Girilen ay ve güne göre burç bulan programı yazınız. Switch-case kullanmadan yapınız. */

package Java101.ConditionalStatements;

import java.util.Scanner;

public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int monthNumber, dayNumber;
        String zodiac = "";
        boolean isError = false;

        System.out.print("\nEnter The Month Of Birth : ");
        monthNumber = input.nextInt();
        System.out.print("Enter The Day Of Birth : ");
        dayNumber = input.nextInt();

        if (monthNumber == 1) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 22) {
                    zodiac = "Capricorn";
                } else {
                    zodiac = "Aquarius";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 2) {
            if (dayNumber >= 1 && dayNumber <= 28) {
                if (dayNumber < 20) {
                    zodiac = "Aquarius";
                } else {
                    zodiac = "Pisces";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 3) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 21) {
                    zodiac = "Pisces";
                } else {
                    zodiac = "Aries";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 4) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber < 21) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Taurus";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 5) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 22) {
                    zodiac = "Taurus";
                } else {
                    zodiac = "Gemini";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 6) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber < 23) {
                    zodiac = "Gemini";
                } else {
                    zodiac = "Cancer";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 7) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 23) {
                    zodiac = "Cancer";
                } else {
                    zodiac = "Leo";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 8) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 23) {
                    zodiac = "Leo";
                } else {
                    zodiac = "Virgo";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 9) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber < 23) {
                    zodiac = "Virgo";
                } else {
                    zodiac = "Libra";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 10) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 23) {
                    zodiac = "Libra";
                } else {
                    zodiac = "Scorpio";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 11) {
            if (dayNumber >= 1 && dayNumber <= 30) {
                if (dayNumber < 22) {
                    zodiac = "Scorpio";
                } else {
                    zodiac = "Sagittarius";
                }
            } else {
                isError = true;
            }
        } else if (monthNumber == 12) {
            if (dayNumber >= 1 && dayNumber <= 31) {
                if (dayNumber < 22) {
                    zodiac = "Sagittarius";
                } else {
                    zodiac = "Capricorn";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.print("\nYou Made An Invalid Entry. Please Try Again!\n");
        }

        System.out.print("\nYour Zodiac Sign : " + zodiac + "\n");

    }

}