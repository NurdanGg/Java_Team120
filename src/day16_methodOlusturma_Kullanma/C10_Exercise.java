package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C10_Exercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println(kelimeSayisi(cumle));
    }

        public static int kelimeSayisi(String cumle){
        int sayac=0;
            for (int i = 0; i < cumle.length(); i++) {

                if(cumle.charAt(i)==' '){
                    sayac++;


                }


            }
            sayac++;
            return (sayac);
        }
}
