package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C06_Exercise {
    public static void main(String[] args) {

         // Write a Java method to compute the average of three numbers.
         //       Test Data:
         //Input the first number: 25
         //Input the second number: 45
         //Input the third number: 65
         //Expected Output:

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi1=scanner.nextDouble();
        System.out.println("Lutfen bir sayi giriniz");
        double sayi2=scanner.nextDouble();
        System.out.println("Lutfen bir sayi giriniz");
        double sayi3=scanner.nextDouble();

        System.out.println(ortalama(sayi1, sayi2, sayi3));

    }

    public static double ortalama(double sayi1, double sayi2, double sayi3 ){

        double ortalama=(sayi1+sayi2+sayi3)/3;
        return ortalama;
    }

}
