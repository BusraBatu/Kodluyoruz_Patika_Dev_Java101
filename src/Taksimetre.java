import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
      /* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.

       */
        Scanner scan= new Scanner(System.in);
        int acilis=10;
        System.out.println("Lutfen kac km yolculuk yapildigini giriniz: ");
        int km=scan.nextInt();
        double ucret=acilis+(km* 2.20);

        System.out.println("Odemeniz gereken tutar: "+(ucret<20?20:ucret));





    }
}
