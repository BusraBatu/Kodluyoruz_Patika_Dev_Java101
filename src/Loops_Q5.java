import java.util.Scanner;

public class Loops_Q5 {
    public static void main(String[] args) {
        //Ödev
        //Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Ussu alinacak sayiyi giriniz: ");
        int alt=scan.nextInt();
        System.out.println("Us olacak sayiyi giriniz: ");
        int us=scan.nextInt();
        int sonuc=1;
        for (int i = 1; i <= us; i++) {
            sonuc*=alt;
        }
        System.out.println("Sonuc: "+sonuc);
























    }
}
