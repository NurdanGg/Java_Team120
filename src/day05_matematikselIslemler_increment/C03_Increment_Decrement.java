package day05_matematikselIslemler_increment;
public class C03_Increment_Decrement {
    public static void main(String[] args) {
        int sayi=10;
        // sayi variable nın değerini 2 katının 5 fazlası yapin

        sayi=2*sayi+5;
        System.out.println(sayi); // 25

        // 2. yöntemle yaparsak
        sayi=10;
        sayi*=2;
        sayi+=5;
        System.out.println(sayi); // 25

        sayi = 10;
        sayi*=3; // sayi=30
        sayi-=3; // sayi=27
        sayi/=3; // sayi=9
        System.out.println(sayi); // 9

        int a=10;

        //a nın değerini yeni oluşturduğumuz b ye atayıp, sonra a nın değerini bir arttırın
        //a ve b yi yazdırın

        int b=a;
        a++;
        System.out.println("a: " + a + "b: " + b ); // a:11 b:10

        a=10;
        // a nın degerini bir arttırın, sonra a nın değerini b ye atayın

        a++;
        b=a;
        System.out.println("a: " + a + "b : " + b); // a:11 b:11

    }

}
