package day05_matematikselIslemler_increment;
import java.util.Scanner;
public class C02_RakamlarToplaminiBulma {
    public static void main(String[] args) {
        // Kullanıcıdan 3 basamaklı bir sayı alıp
        // sayının rakamlarını toplayıp yazdırın

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı pozitif bir tamsayı giriniz");
        int girilenSayi=scanner.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        // İlk sayi için birler basamağını bulalım
        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        //birler basamağındaki sayıyı aldık, artık ondan kurtulalım
        girilenSayi=girilenSayi/10;

        // bu satıra geldiğimizde girilen sayıyı 2 basamaklı hale donuşturduk
        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi;
        girilenSayi=girilenSayi/10;

        //buraya geldiğimizde artık sayimiz tek basamaklı
        birlerBasamagi=girilenSayi%10;

        rakamlarToplami=rakamlarToplami+birlerBasamagi;

        girilenSayi=girilenSayi/10;

        System.out.println("Rakamlar toplamİ : " + rakamlarToplami);

    }

}
