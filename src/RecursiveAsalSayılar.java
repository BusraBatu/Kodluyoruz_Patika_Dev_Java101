import java.util.Scanner;

public class RecursiveAsalSayılar {
    /*
    Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
     */


    static boolean recursive(int a, int b) {
        if(a<2){ return false;}
        else if(a%b==0){ return false;}
        else if (a%b!=0) return true;
       return recursive(a, b++);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int a = scan.nextInt();
        int b=2;

        if(recursive(a,b)){
            System.out.println(a+" sayısı asal sayıdır");
        }else{
            System.out.println(a+" sayısı asal sayı değildir");
        }
    }
}
