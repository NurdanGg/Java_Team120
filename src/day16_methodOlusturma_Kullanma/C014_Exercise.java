package day16_methodOlusturma_Kullanma;

public class C014_Exercise {
    public static void main(String[] args) {
        // While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari yazdirin (methotla)
        tamSayilar();



    }
    public static void tamSayilar(){
        int sayi1=10;

        while (sayi1<=99){
            if(sayi1%7==0)
                System.out.print(sayi1+" ");
            sayi1++;
        }



    }
}
