import java.util.Scanner;

public class Loops_Q2 {
    public static void main(String[] args) {
        //Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        while (sayi%2!=1){
            System.out.println("Sayi giriniz: ");
            sayi= scan.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }

        }
        System.out.println("Girilen sayilardan 4'un kati olan sayilarin toplami: "+toplam);
        scan.close();























    }
}
