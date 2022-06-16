import java.util.Scanner;

public class YıldızYapımı {
    /*
    Ödev
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0; i<n; i++){
            for(int k=1; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)+1; j++ ){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i=1; i<n; i++){
            for(int k=0; k<i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*(n-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
