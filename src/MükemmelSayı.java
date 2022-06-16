import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number=scan.nextInt();
        int perfectNumber=0;
        for(int i=1; i<number; i++){
            if(number%i==0){
                perfectNumber+=i;
            }
        }
        if(number==perfectNumber){
            System.out.println(number+ " sayısı mükemmel sayıdır.");
        }else{
            System.out.println(number+ " sayısı mükemmel sayı değildir.");
        }
    }
}
