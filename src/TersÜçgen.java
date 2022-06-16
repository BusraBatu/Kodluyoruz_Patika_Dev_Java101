import java.util.Scanner;

public class TersÜçgen {
    /*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
*/
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Üçgenin kaç basamaklı olmasını istiyorsunuz?");
        int howMany=scan.nextInt();
        for(int i=1; i<=howMany; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<2*(howMany-i)+2; k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

