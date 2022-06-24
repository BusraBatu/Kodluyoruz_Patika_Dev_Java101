import java.util.Arrays;
import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        /*
        Ödev
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz: ");
        int numberOfElements= scan.nextInt();
        System.out.println("Lütfen sayıları giriniz: ");
        int []arr= new int[numberOfElements];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        double sub=0.0;
        for (int i = 0; i < arr.length ; i++) {
                sub+=1.0/arr[i];
        }

        double x= numberOfElements;
        double harmonicAverage=x/sub;
        System.out.println("Girdiğiniz sayıların harmonik ortalaması: "+harmonicAverage);







    }

}
