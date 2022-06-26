import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DizilerdeTekrarEdenSayılar {
    /*
    Şimdi sıra sende! Bir sayı dizisindeki tekrar eden
    çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen oluşturmak istediğiniz dizinin kaç elemanlı olacağını giriniz: ");
        int numberOfElements=scan.nextInt();
        int arr[]= new int[numberOfElements];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scan.nextInt();
        }

        HashSet frequency= new HashSet();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if((arr[i]==arr[j]) && arr[i]%2==0){
                    frequency.add(arr[i]);
                }
            }

        }
        System.out.println(frequency);

    }
}
