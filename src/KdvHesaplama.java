import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
        Scanner scan= new Scanner(System.in);
        System.out.println("Kdv'si hesaplanacak tutar: ");

        double tutar=scan.nextInt();

        double kdvOrani=0.18;
        double kdvliTutar=tutar+(tutar*kdvOrani);

        double kdvOrani2=0.8;
        double kdvliTutar2=tutar+(tutar*kdvOrani2);

        System.out.println("KDV'li toplam tutar: "+ (tutar<1000 & tutar>0 ? kdvliTutar : kdvliTutar2));





















    }
}
