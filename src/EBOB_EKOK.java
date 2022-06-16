import java.util.Scanner;

public class EBOB_EKOK {
    /*
    Ödev
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int a=scan.nextInt();
        System.out.println("2. sayıyı giriniz");
        int b= scan.nextInt();

        //=============EBOB===========//
        int x=1;
        int ebob=1;
        if(a>=b){
            while(x<=b){
            if(a%x==0 && b%x==0){
                ebob=x;

            }x++;
        }
        }else{
            while(x<=a){
                if(a%x==0 && b%x==0){
                    ebob=x;

                }x++;
            }
        }

        System.out.println(a + " sayısının ve "+ b + " sayısının EBOB'u: "+ ebob);


        //=============EKOK===========//

        int ekok=(a*b)/ebob;

        System.out.println(a+ " sayısının ve "+b + " sayısının EKOK'u: " + ekok);



    }
}
