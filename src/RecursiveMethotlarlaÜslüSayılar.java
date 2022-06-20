import java.util.Scanner;

public class RecursiveMethotlarlaÜslüSayılar {
    /*
    Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
     */
static int recursive(int a, int b){
    if(b==0) return 1;
    if(b==1) return a;

    return recursive(a,1)* recursive(a,b-1);

}
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Taban sayı: ");
        int taban=scan.nextInt();
        System.out.print("Üs sayı: ");
        int üs=scan.nextInt();
        System.out.println("Sonuç: "+recursive(taban,üs));
    }
}
