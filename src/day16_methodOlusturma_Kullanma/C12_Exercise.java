package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C12_Exercise {
    public static void main(String[] args) {
        // Write a Java method to check whether a string is a valid password.
        // Password rules:
        // A password must have at least ten characters.
        // A password consists of only letters and digits.
        // A password must contain at least two digits.

        //

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir şifre giriniz");
        String sifre= scanner.nextLine();
        sifreKontrol(sifre);


    }   public static void sifreKontrol(String sifre) {
        boolean flag = true;
        int sayac = 0;
        for (int i = 0; i < sifre.length(); i++) {
            if (!(sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') && (!(sifre.charAt(i) >= '0' && i <= '9'))) {
                System.out.println("A password consists of only letters and digits.");
                flag = false;
                break;
            }
            if (sifre.charAt(i) <= '9' && sifre.charAt(i) >= '0') {
                sayac++;
            }
            if (sifre.length() < 10) {
                flag = false;
                System.out.println("A password must have at least ten characters");
                break;
            }
        }
        if (!(sayac >= 2)) {
            flag = false;
            System.out.println("A password must contain at least two digits.");
        }
        if (flag) {
            System.out.println("başarılı");
        }


    }


}
