import java.util.Scanner;

public class RecursiveAzalanArtan {
    /*
    Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16
     */


    static int minus(int number,int result) {
        System.out.print(number+" ");
        if (number > 0) {
            return minus(number-5,result);

        } else {
            return plus(number+5,result);
        }


    }

    static int plus(int number, int result) {
        System.out.print(number+" ");
        if (result==number) {
            return 0;
        }else{
            return plus(number+5,result);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number = scan.nextInt();
        int result=number;
        System.out.println("N sayısı: "+number);
        System.out.print("Çıktısı: ");
        minus(number,result);
    }
}
