import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DizideEnYakınKüçükBüyükSayı {
    public static void main(String[] args) {
        /*
        Ödev
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kaç elemanlı bir dizi yazmak istediğnizi giriniz: ");
        int howMany=scan.nextInt();
        System.out.println("Lütfen dizinin elemanlarını giriniz:  ");
        int[]arr= new int[howMany];
        for (int i = 0; i <arr.length ; i++) {
        arr[i]=scan.nextInt();
        }
        //System.out.println("Dizi: "+Arrays.toString(arr));
        System.out.print("Lütfen yakınlığını bulmak istediğiniz sayıyı giriniz: ");
        int number=scan.nextInt();

        //1.yol
        Arrays.sort(arr);
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]<number){
                count++;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+ arr[count-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+ arr[count]);

    }
}
