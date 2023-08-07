package day05_matematikselIslemler_increment;

public class C04_Preincrement_Postincrement {
    public static void main(String[] args) {
        // Javada bir önceki class ta yaptığımız gibi
        // artırma ve atama, veya artırma ve yazdırma beraber olabilir

        int a=20;
        int b=10;
        System.out.println(b=2*a); // 40
        System.out.println(a=b-5); // 35

        a=10;
        // once a nın degerini b ye atayın, sonra a yı arttırın

        b=a++;
        System.out.println("a : " + a + "b : " + b); // a : 11 b:10

        a=10;
        // once a nın değerini  bir arttırın, sonra a nın değerini b ye atayın

        b=++a;
        System.out.println("a : " + a + "b : " + b);  // a:11 b:11

        /*  Bu kullanım sadece a++ a-- ++a --a  icin gecerlidir
            burada ++ veya --'yi önce mi yoksa sonra mı kullanacağımıza bizden
            istenen duruma göre karar veririz.

            artırma once ise ++a
            artırma sonra ise a++
         */
        
        a=20;
        System.out.println(a++); // 20
        System.out.println(a); //21

        a=20;
        System.out.println(--a); // 19
        System.out.println(a); // 19
    }
}
