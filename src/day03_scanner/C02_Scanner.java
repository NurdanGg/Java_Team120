package day03_scanner;
import java.util.Scanner;
public class C02_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı alıp, karesini yazdirin
        //Scanner ile kullanıcıdan bir bilgiyi 3 adımda alabiliriz
        //1.adım : Scanner objesi oluşturmak

        Scanner scanner = new Scanner(System.in);
        //2.adım : Kullanıcıya ne istediğinizi söyleyin
        System.out.println("Lütfen bir tamsayi giriniz");
        //3.adim istediğiniz datanın turune uygun bir variable oluşturun
        //       ve scanner objesini kullanarak uygun methodla
        //       kullanıcının girdiği degeri alın

        int girilenSayi=scanner.nextInt();
        //artık kullanıcının girdiği sayi kod ortamımıza kaydedildi
        //bu variable ı istediğimiz şekilde kullanabiliriz

        System.out.println("Girilen sayinin karesi : " +girilenSayi*girilenSayi);

    }
}
