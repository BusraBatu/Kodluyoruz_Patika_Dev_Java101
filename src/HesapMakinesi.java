import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Lutfen islem yapmak istediginiz ilk sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        System.out.println("1.Toplama \n2.Cikarma \n3.Carpma \n4.Bolme \nLutfen yapmak istediginiz islemi seciniz: ");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam: "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Fark: "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Carpim: "+(sayi1*sayi2));
                break;
            case 4:
                if (sayi2!=0){
                System.out.println("Bolum: "+(sayi1/sayi2));
                }else{
                    System.out.println("Herhangi bir sayiyi sifira bolemezsiniz");
                }
                break;
            default:
                System.out.println("Yanlis secim yaptiniz lutfen tekrar deneyiniz");
                break;
        }
        scan.close();
    }
}
