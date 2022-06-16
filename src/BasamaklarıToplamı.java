import java.util.Scanner;

public class BasamaklarıToplamı {
    /*
    Ödev
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
     */


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int permanentNumber=scan.nextInt();
        int number= permanentNumber;
        int count=0;
        while(number!=0){
            number/=10;
            count++;
        }

        int total=0;
        for(int i=1; i<=count; i++){
           total+= permanentNumber%10;
           permanentNumber/=10;
        }
        System.out.println(total);
    }
}
