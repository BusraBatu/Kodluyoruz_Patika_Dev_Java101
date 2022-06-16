import java.util.Scanner;

public class Loops_Q6 {
    public static void main(String[] args) {
     //  //Ödev
     //  //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
     //  //
     //  //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

     //  Scanner scan= new Scanner(System.in);
     //  System.out.println("Basamaklari toplamini bulmak icin bir sayi giriniz: ");
     //  int sayi=scan.nextInt();
     //  int toplam=0;

     //  while(sayi!=0){
     //     toplam+=sayi%10;
     //     sayi/=10;
     //  }

     //  System.out.println("Basamaklar toplami: "+toplam);


        //Uc basamakli Armstrong sayilari bulunuz
        int total=0;
        int number=1;
        for (int i = 100; i <=999 ; i++) {
            int temp=i;
            for (int j = 1; j <=3 ; j++) {
              number*= temp%10;

            }total+=number;


        }
















    }
}
