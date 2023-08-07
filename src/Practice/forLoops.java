package Practice;
import java.util.Scanner;
public class forLoops {
    public static void main(String[] args) {

        //  1’den 100’e kadar sayilari ayni satirda aralarinda bir bosluk birakarak
        //  yazdirin

        //for (int i = 1; i < 100; i++) {
         //  System.out.print(i + " ");
        //}

        //  Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        //  dahil) 7 ila bolunebilen sayilari yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        for (int i = 1; i <= girilenSayi; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        }
}
