import java.util.Scanner;

public class FibonacciSerisi {
    /*
    Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

    9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaç elemanlı bir fibonacci serisi istiyorsunuz?");
        int x= scan.nextInt();
        int a[]=new int[x+2];
        a[0]=1;

        System.out.print(0+" ");
        for (int i=0; i<x; i++){

            a[i+2]=a[i+1]+a[i];
            System.out.print(a[i+2]+" ");
        }
    }
}
