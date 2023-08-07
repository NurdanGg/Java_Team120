package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C05_Exercises {
    public static void main(String[] args) {


        // Write a Java method to find the smallest number among three numbers.
        //Test Data:
        // Input the first number: 25
        // Input the Second number: 37
        // Input the third number: 29
        // Expected Output:

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Bir sayı giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Bir sayı giriniz");
        int sayi3 = scanner.nextInt();


        System.out.println("En kucuk sayi: " + enKucukSayi(sayi1, sayi2, sayi3));

    }
    
    public static int enKucukSayi(int sayi1, int sayi2, int sayi3) {

        int kucukSayi = 0;

        if (sayi1 < sayi2 && sayi1 < sayi3) {
            kucukSayi = sayi1;
        } else if (sayi2 < sayi1 && sayi2 < sayi3) {
            kucukSayi = sayi2;
        } else {
            kucukSayi = sayi3;
        }
        return kucukSayi;

    }

    
}
