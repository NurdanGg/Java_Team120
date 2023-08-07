package day03_scanner;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Soru 3-Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //        Isminiz : John
        //        Soyisminiz : Doe
        //        Yasiniz : 44
        //        Kaydiniz basariyla tamamlanmistir.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String girilenIsim=scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String girilenSoyisim=scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        int girilenYas=scanner.nextInt();

        /*
        System.out.println("Isminiz : " + girilenIsim);
        System.out.println("Soyisminiz : " + girilenSoyisim);
        System.out.println("Yasiniz : " + girilenYas);
        System.out.println("Kaydınız basariyla tamamlanmistir.");
        */

        // sout içerisindeki bir String in yazdırılmasına
        // alt satirdan devam edilmesini isterseniz
        // String in alt satira geçmesini istediginiz kısmında \n yazin

        System.out.println("Isminiz : " + girilenIsim +
                "\nSoyisminiz : " + girilenSoyisim +
                "\nYasiniz : " + girilenYas +
                "\nKaydınız basariyla tamamlanmistir.");
    }
}
