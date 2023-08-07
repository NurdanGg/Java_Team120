package day16_methodOlusturma_Kullanma;
import java.util.Scanner;

public class C09_Exercise {
    public static void main(String[] args) {

        //Write a Java method to count all vowels in a string.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        kacSesliHarfVar(metin);
    }
    public static void kacSesliHarfVar (String metin){

        String sesliHarfler = "aeıioöuü";
        int sayac =0;
        for (int i = 0; i <metin.length() ; i++) {
            if (sesliHarfler.contains(metin.substring(i,i+1))){
                sayac++;
            }

        }
        System.out.println("girilen metindeki sesli harf sayısı: "+sayac);
    }





}
