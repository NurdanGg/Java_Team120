package day04_dataCasting_wrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        /*
        char, boolean ve Stringi diger data turlerine cast edemeyiz
        Sayisal data iceren primitive data turlerini birbirine cast edebiliriz

        1-daha kucuk data turundeki degeri, daha geniş data turundeki variable a atama yaparsak
        Java auto Widening yapar
        yani otomatik olarak bu işlemi yapar
        2-daha geniş kapsamlı data turundeki degeri, daha dar kapsamlı variable a atama yaparsak
        Java bunu otomatik olarak yapmaz
        Biz sorumluluğu üzerimize alarak bu casting i yaptırabiliriz

        sorumlulugu almak için
        degerin onune bir parantez acıp
        parantez icine cast etmek istedigimiz data turunu yazabiliriz

        Daraltma (Explicit Narrowing) yapildiginda data kayıplari
        olabilecegi gibi, data baskalasabilir de
         */
        String str="Java Candir";
        // int sayi1=(int)str;
        // char chr1=(char)str;
        // boolean bl1=str;

        String s1=str;
        //boolean bl2=10;
        //boolean bl2='s';

        int sayi2='k';
        double dbl1=sayi2;
        // String str2=sayi2;

        int sayi3=10;
        double dbl2=4.5;
        short sh1=3;
        byte by1=7;

        sayi3=(int)dbl2;
        sayi3=sh1;
        sayi3=by1;

        dbl2=sayi3;
        dbl2=sh1;
        dbl2=by1;

        by1=(byte)dbl2;
        by1=(byte)sh1;
        by1=(byte)sayi3;

        sh1=(short)dbl2;
        sh1=(short)sayi3;
        sh1=by1;


    }
}
