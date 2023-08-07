package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C11_Exercise {
    //Belirli bir yıl sayısı için
    // belirli bir faiz oranında
    // gelecekteki yatırım değerini hesaplayan bir Java yöntemi yazın.

    // formül Faiz Tutarı = Anapara x Faiz Oranı x Birim Süre

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen faiz getirisi istediğiniz tutarı giriniz");
        double anaPara=scanner.nextDouble();
        System.out.println("Lutfen paranızın faizde kalmasını istediğiniz yıl sayısını seçiniz");
        int sure= scanner.nextInt();
        System.out.println(faizGetirisi(anaPara, sure));

    }

        public static double faizGetirisi(double anaPara, int sure){
        double faizOrani=1.29;
        double toplamanapara=anaPara*sure*faizOrani;
        return (toplamanapara);
    }

}
