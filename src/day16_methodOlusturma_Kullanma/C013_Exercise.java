package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C013_Exercise {
    public static void main(String[] args) {
          // Write Java methods to calculate triangle area.
          // Expected Output:

          // Input Side-1: 10
          // Input Side-2: 15
          // Input Side-3: 20
          // The area of the triangle is 72.6184377413890

        Scanner scanner=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        double kenar1=scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3=scanner.nextDouble();

        System.out.println(ucgeninAlani(kenar1, kenar2, kenar3));

    }

    public static double ucgeninAlani(double kenar1, double kenar2, double kenar3) {
        double alan = 0;
        double s = (kenar1 + kenar2 + kenar3) / 2;

        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            alan = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
        } else {
            System.out.println("Girdiginiz degerler hatalı");
        }
        return (alan);
    }
}

