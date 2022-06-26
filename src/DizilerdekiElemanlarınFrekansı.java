import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DizilerdekiElemanlarınFrekansı {
    /*
    Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç tane sayı girmek istiyorsunuz: ");
        int numberOfElements= scan.nextInt();
        System.out.println("Lütfen sayıları giriniz: ");
        List<Integer>list=new ArrayList<>();
        for (int i = 0; i <numberOfElements ; i++) {
            list.add(scan.nextInt());
        }
        // Lambda Solution
        list.
                stream().
                map(t-> t+" sayısı "+Collections.frequency(list, t)+ " kere tekrar edildi").
                distinct().
                forEach(t->System.out.println(t));
    }










}
