import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        //Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen alanini bulmak istediginiz ucgenin kenar uzunluklarini giriniz: ");
        int kenar1=scan.nextInt();
        int kenar2=scan.nextInt();
        int kenar3=scan.nextInt();
        int alan=(kenar1*kenar2*kenar3);
        System.out.println("Ucgenin alani: "+alan);


















    }
}
