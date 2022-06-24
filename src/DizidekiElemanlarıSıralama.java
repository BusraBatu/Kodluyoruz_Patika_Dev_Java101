import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        /*
        ava dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
         Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz: ");
        int numberOfElements= scan.nextInt();
        System.out.println("Lütfen sayıları giriniz: ");
        int []arr= new int[numberOfElements];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
