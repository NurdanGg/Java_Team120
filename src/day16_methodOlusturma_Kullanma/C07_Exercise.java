package day16_methodOlusturma_Kullanma;
import java.util.Scanner;
public class C07_Exercise {
    public static void main(String[] args) {
            //Write a Java method to display the middle character of a string.
          //Note: a) If the length of the string is odd there will be two middle characters.
          //b) If the length of the string is even there will be one middle character.
          //Test Data:
          //Input a string: 350

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        metin(metin);


    }

    public static void metin(String metin){

        int baslangıc;
        int bitis;
        if(metin.length()%2==0) {
            baslangıc=metin.length()/2-1;
            bitis=metin.length()/2+1;
            System.out.println(metin.substring(baslangıc,bitis));
        }else {
            baslangıc=metin.length()/2;
            bitis=metin.length()/2+1;
            System.out.println(metin.substring(baslangıc,bitis));
        }


    }
}
