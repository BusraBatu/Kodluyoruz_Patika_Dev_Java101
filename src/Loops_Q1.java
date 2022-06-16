import java.util.Scanner;

public class Loops_Q1 {
    public static void main(String[] args) {
        //Ödev
        //Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
        // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi=scan.nextInt();
        int toplam=0;
        int count=0;
        for (int i=1; i<=sayi; i++){
            if ((i%3==0) && (i%4==0)){
                toplam+=i;
                count++;
            }
        }

        double ortalama=toplam/count;
        System.out.println("Girdiginiz sayiya kadar 3'e ve 4'e bolunen sayilarin ortalamasi: "+ortalama);
        scan.close();












    }

}
