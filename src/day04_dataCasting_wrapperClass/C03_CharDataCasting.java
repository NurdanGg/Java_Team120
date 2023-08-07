package day04_dataCasting_wrapperClass;
public class C03_CharDataCasting {
    public static void main(String[] args) {
        /*  char data turu ozel bir data turudur
            her ne kadar char data turu
            ' ' içerisinde sayi, harf, ozel karakter alsa da
            ascii tablosundaki sayisal degerleri de kullanabilir

            aynı şekilde
            char data turundeki bir variable ı
            matematiksel islemde kullanırsanız
            ascii tablosundaki degeri ile matematiksel isleme girer
         */

        char ch1= 'C';
        int sayi1= ch1;
        System.out.println("ch1: " + ch1);  // C
        System.out.println("sayi: " + sayi1);   // 67

        String str1= "Java";
        String str2= " ";
        String str3= "Candir";

        System.out.println(str1+str2+str3);   // Java Candir

        char ch2='a';
        char ch3='b';

        System.out.println(ch2 + ch3);  //  97 + 98 = 195

        // verilen int bir sayinin ascii tablosundaki char karsiligini yazdirin
        int karakter=50;
        char asciDegeri=(char)karakter;

        System.out.println("Verilen sayinin ascii tablosundaki karsiligi : "+ asciDegeri);






    }
}
