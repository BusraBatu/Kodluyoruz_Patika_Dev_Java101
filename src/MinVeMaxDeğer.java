import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinVeMaxDeğer {
    public static void main(String[] args) {
        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük
         ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz?");
        int piece=scan.nextInt();
        int arr[]=new int [piece];
        for(int i=0; i<piece; i++){
            System.out.print(i+1+". sayıyı giriniz:");
            arr[i]=scan.nextInt();
            System.out.println();
        }
        Arrays.sort(arr);
        System.out.println("girilen en küçük sayı: "+ arr[0]);
        System.out.println("girilen en büyük sayı: "+ arr[piece-1]);

    }
}
