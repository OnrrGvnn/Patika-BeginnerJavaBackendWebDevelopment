// Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.

package Java101.Loops;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3, balance = 1500;
        int select, userMoney;

        System.out.println("\nWelcome To X Bank!");


        while (right > 0) {
            System.out.print("\nPlease Enter Your Username : ");
            userName = input.nextLine();
            System.out.print("Please Enter Your Password : ");
            password = input.nextLine();

            if ((userName.equals("patika") && (password.equals("dev123")))) {
                System.out.println("\nHello Patika !");

                do {
                    System.out.println("Please Select The Action You Want To Perform !");
                    System.out.println("\n1-Deposit Cash \n2-Withdraw Cash \n3-Check Balance \n4-Exit");
                    System.out.print("\nYour Select : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("\nEnter Deposit Amount : ");
                            userMoney = input.nextInt();
                            balance += userMoney;
                            System.out.println("\nYour cash has been accepted.\n");
                            break;
                        case 2:
                            System.out.print("\nEnter Withdraw Amount : ");
                            userMoney = input.nextInt();

                            if (userMoney > balance) {
                                System.out.println("\nInsufficient Balance!\n");
                            } else {
                                balance -= userMoney;
                                System.out.println("\nPlease Withdraw Your Money From Tray.\n");
                            }

                            break;
                        case 3:
                            System.out.println("\nBalance = " + balance + "\n");
                            break;
                        case 4:
                            System.out.println("\nThank you for choosing us.");
                            break;
                        default:
                            System.out.println("\nInvalid selection!\n");
                            break;
                    }

                } while (select != 4);

                break;

            } else {
                right--;

                if (right == 0) {
                    System.out.println("\nYour Account Has Been Blocked. Please Contact Your Bank.");
                } else {
                    System.out.println("\nInvalid Username Or Password. Please Try again !");
                    System.out.println("Your Remaining Attempts: " + right);
                }

            }

        }

    }

}