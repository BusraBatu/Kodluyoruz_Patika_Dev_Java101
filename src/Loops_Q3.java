import java.util.Scanner;

public class Loops_Q3 {
    public static void main(String[] args) {
        //Ödev
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        Scanner scan= new Scanner(System.in);
        System.out.println("Sayi giriniz: ");
        int sayi=scan.nextInt();
        int i=1;
        int k=1;
        System.out.print("Girilen sayiya kadar 4'un kuvvetleri: ");
        while(i<sayi){
            System.out.print(i+" ");
            i*=4;
        }
        System.out.println();
        System.out.print("Girilen sayiya kadar 5'in kuvvetleri: ");
        while(k<sayi){
            System.out.print(k+" ");
            k*=5;
        }





















    }
}
