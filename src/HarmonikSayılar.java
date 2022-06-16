import java.util.Scanner;

public class HarmonikSayılar {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number=scan.nextInt();
        double result=0.0;
        for(double i=1; i<=number; i++){
            result+=(1/i);
        }
        System.out.println(result);
    }
}
