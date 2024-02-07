/*  Javada koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden programı yazınız. Eğer şifre yanlış ise kullanıcıya şifresini
sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı
olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */

package Java101.ConditionalStatements;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password, select;

        System.out.println();
        System.out.print("Please Enter Your Username : ");
        userName = input.nextLine();
        System.out.print("Please Enter Your Password : ");
        password = input.nextLine();

        if (userName.equals("patika") && (password.equals("java123"))) {
            System.out.println("\nLogged In!");
        } else {
            System.out.println("\nUsername Or Password Is Incorrect!");
            System.out.println("Would You Like To Reset Your Password?");
            System.out.print("Yes Or No? : ");
            select = input.nextLine();

            switch (select) {
                case "Yes":
                    System.out.print("\nPlease Choose A New Password : ");
                    String newPass;
                    newPass = input.nextLine();

                    if (newPass.equals("java123")) {
                        System.out.println("\nThe New Password Cannot Be The Same As The Previous One!");
                    } else {
                        System.out.println("\nYour New Password Has Been Successfully Created!");
                    }
                    break;
                case "No":
                    System.out.println("\nYou Are Being Redirected To The Login Page!");
                    break;
            }

        }

    }

}
