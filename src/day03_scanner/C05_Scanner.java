package day03_scanner;
import java.util.Scanner;
public class C05_Scanner {
    public static void main(String[] args) {
        // Soru 4- Kullanıcıdan bir dikdortgenin 2 kenar uzunlugunu alip
        //           dikdortgenin alanını yazdırın

        Scanner scanner = new Scanner(System.in);
        //hocanın yöntemi
        //System.out.println("Lutfen dikdortgenin iki kenarını giriniz");
        //double kenar1 = scanner.nextDouble();
        //double kenar2 = scanner.nextDouble();
        //System.out.println("Dikdortgenin alani: " + kenar2*kenar1);


        //Benim yöntemim
        System.out.println("Lütfen uzun kenarı giriniz");
        int uzunKenar= scanner.nextInt();
        System.out.println("Lütfen kısa kenarı giriniz");
        int kisaKenar= scanner.nextInt();
        System.out.println("Dikdörtgenin alani: " + uzunKenar*kisaKenar);



    }
}
