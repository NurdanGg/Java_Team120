package day04_dataCasting_wrapperClass;
import java.util.Scanner;
public class C04_CharCasting {
    public static void main(String[] args) {
        // Kullanicidan bir char isteyin
        // girilen chardan sonraki 3 karakteri yazdirin
        // Orn : input : a  output : b,c,d

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii tablosundan bir karakter giriniz");

        char girilenKrk=scanner.next().charAt(0);
        // scanner.nextChar() methodu olmadigindan
        // once .next() ile String olarak alip, sonra o stringin ilk karakterini alalim

        System.out.println("Girilen karakter : " + girilenKrk);
        System.out.println("Girilen karakter'den sonraki 3 karakter :  " +
                (char)(girilenKrk+1) +", "+
                (char)(girilenKrk+2) +", "+
                (char)(girilenKrk+3));
    }
}
