import java.util.Scanner;

public class Loops_Q4 {
    public static void main(String[] args) {
        //Ödev
        //N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        //
        //Java ile kombinasyon hesaplayan program yazınız.
        //
        //Kombinasyon formülü
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner scan= new Scanner (System.in);
        System.out.print("Kambinasyon icin 1.sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("Kombinasyon icin 2.sayiyi giriniz: ");
        int sayi2=scan.nextInt();

        int sayi1Faktoriyel=1;
        for (int i = sayi1; i >=1 ; i--) {
            sayi1Faktoriyel*=i;
        }



        int sayi2Faktoriyel=1;
        for (int i = sayi2; i >=1 ; i--) {
            sayi2Faktoriyel*=i;
        }



        int sayi3=(sayi1-sayi2);
        int sayi3Faktoriyel=1;
        for (int i = sayi3; i >=1 ; i--) {
            sayi3Faktoriyel*=i;
        }

        int kombinasyon=sayi1Faktoriyel/(sayi2Faktoriyel*sayi3Faktoriyel);

        System.out.println("Girdiginiz sayilarin kombinasyon sonucu: "+kombinasyon);

        scan.close();





















    }
}
