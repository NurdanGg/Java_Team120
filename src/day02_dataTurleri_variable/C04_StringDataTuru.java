package day02_dataTurleri_variable;

public class C04_StringDataTuru {
    public static void main(String[] args) {
        int sayi=20;
        System.out.println(); // 20
        String isim = "Berk Yilmaz";
        System.out.println(isim.toUpperCase()); // BERK YILMAZ
        System.out.println(isim.toLowerCase()); // berk yılmaz
        System.out.println(isim);  // Berk Yilmaz

        String str1="Java";
        String str2="Candir";

        System.out.println(str1 + str2);
        // İki tane string + işareti ile toplanmaya çalışılırsa
        // Java o iki stringi birleştirir
        // JavaCandir

        String str3="30";
        String str4="40";

        System.out.println(str3 + str4);  // 3040

        // Verilen isim ve soyismi
        // Girilen ali uzunkavak database e kaydedildi
        // şeklinde

        String adi="Ramazan";
        String soyadi="Tatar";

        System.out.println("Girilen "+ adi + " " + soyadi + " database'e kaydedildi");

        // " " arasındaki bosluklar konsolda yazdirilan metne yansir
        // ancak kodlar arasinda birakilan bosluklar metne yansimaz
        System.out.println("Girilen "+      adi      + " " + soyadi + " database'e kaydedildi");



    }
}
