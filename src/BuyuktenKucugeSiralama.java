import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen karsilastirmak icin uc sayi giriniz \n1.sayi: ");
        int a=scan.nextInt();
        System.out.println("2.sayi: ");
        int b=scan.nextInt();
        System.out.println("3.sayi: ");
        int c=scan.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if((b>a)&&(b>c)){
            if (a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else{
            if (a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }
        scan.close();



























    }
}
